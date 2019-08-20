package jp.co.myapp.common.util;

import java.nio.charset.StandardCharsets;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * Mail連携用コンポーネント
 */
@Component
public class SendMailUtil {

	@Inject
	protected JavaMailSender mailSender;

	@Inject
	Configuration freemarkerConfiguration;

	/**
	 * メールを送信する。
	 * 
	 * @param mailFrom
	 *            送信者メールアドレス
	 * @param mailTo
	 *            宛先
	 * @param subject
	 *            タイトル
	 * @param templateFile
	 *            templateFile
	 * @param model
	 */
	public boolean sendMail(String mailFrom, String mailTo, String subject, String templateFile, Object model) {
		return sendMail(mailFrom, mailTo, subject, templateFile, null, model);
	}

	/**
	 * メールを送信する。
	 * 
	 * @param mailFrom
	 *            送信者メールアドレス
	 * @param mailTo
	 *            宛先
	 * @param subject
	 *            タイトル
	 * @param templateFile
	 *            templateFile
	 * @param attachment
	 *            String
	 * @param model
	 *            Object
	 */
	public boolean sendMail(String mailFrom, String mailTo, String subject, String templateFile, String attachment,
			Object model) {
		mailSender.send(new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, StandardCharsets.UTF_8.name());
				helper.setFrom(mailFrom);
				helper.setTo(mailTo);
				helper.setSubject(subject);
				Template template = freemarkerConfiguration.getTemplate(templateFile);
				String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
				text = replaceLineChar(text);
				helper.setText(text, true);
				if (attachment != null) {
					FileSystemResource file = new FileSystemResource(attachment);
					helper.addAttachment(file.getFilename(), file);
				}
			}

			/**
			 * @param text
			 * @return
			 */
			private String replaceLineChar(String text) {
				if (text == null) {
					return "";
				}
				return text.replace("\r\n", "<br>");
			}
		});
		return true;
	}

}
