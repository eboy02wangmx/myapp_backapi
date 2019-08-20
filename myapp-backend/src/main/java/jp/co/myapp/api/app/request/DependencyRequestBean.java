package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.lang.reflect.Field;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

/**max
 * 依頼書印刷用クラス
 *
 * @author temp
 *
 */
public class DependencyRequestBean implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String bankType;
    private String pdfType ;
    private String insatuNo; // 印刷連番
    private String policy; // 証券番号"
    private String kashoCd; // 営業課店 コード"
    private String dairitenCd; // 代理店 コード" agentCode
    private String shikiNeng; // 保険始期 年号"
    private String shikiNen; // 保険始期 年"
    private String shikiTuki; // 保険始期 月"
    private String shikiHi; // 保険始期 日"
    private String shikiNenkan; // 保険始期 年間"
    private String knameK; // 保険契約者 contractorName
    private String kname; // 保険契約者 フリガナ"
    private String haraiHoho; // 払込方法"
    private String idoUkeKbn;// 取扱事由"
    private String iraiNeng;// 依頼日 年号
    private String iraiNen; // 依頼日 年"
    private String iraiTuki; // 依頼日 月
    private String iraiHi;// 依頼日 日"
    @CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{yokinshaMeiK.label;max.30;enter.event}")
    private String yokinshaMeiK; // 口座名義人"
    @CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{yokinshaMei.label;max.30;enter.event}")
    private String yokinshaMei; // 口座名義人 フリガナ
    private String ginkoCd; // ゆうちょ銀行以外 金融機関コード"
    private String ginkoShitenCd; // ゆうちょ銀行以外 店番号"
    private String yokinShurui; // ゆうちょ銀行以外 預金種目
    @CustomizeTypeSizeString(max = 7, regexp = "", message = "E00001", params = "{kozaNo.label;max.7;enter.event}")
    private String kozaNo; // ゆうちょ銀行以外 口座番号
    private String furikaeCd; // ゆうちょ銀行以外 振替日
    private String furikaeKaishiNeng; // ゆうちょ銀行以外 振替開始(変更)月 年号"
    private String furikaeKaishiNen;// ゆうちょ銀行以外 振替開始(変更)月 年"
    private String furikaeKaishiTuki;// ゆうちょ銀行以外 振替開始(変更)月 月"
    private String ryoshuHangakiFuyo; // 振替済通知(領収書)"
    private String ichikaibunHokenryoShu; // 1回分保険料 主契約"
    private String ichikaibunHokenryoJi; // 1回分保険料 地震"
    private String kashoMeiK;// 営業課店 名称" sectionName
//    private String kashoMeiK1;// 営業課店 名称"
    private String dairiMeiK; // 代理店 名称"
//    private String dairiMeiK1; // 代理店 名称"
    private String ginkoNmKna;// ゆうちょ銀行以外 金融機関 フリガナ"
    private String ginkoNmKnj; // ゆうちょ銀行以外 金融機関名"
//    private String ginkoNmKnj1; // ゆうちょ銀行以外 金融機関名"
    private String ginkoShitenNmKna; // ゆうちょ銀行以外 支店 フリガナ"
    private String ginkoShitenNmKnj;// ゆうちょ銀行以外 支店名"
//    private String ginkoShitenNmKnj1; // ゆうちょ銀行以外 支店名
	@CustomizeTypeSizeString(max = 6, regexp = "", message = "E00001", params = "{yuchoGinkoShitenCd.label;max.6;enter.event}")
    private String yuchoGinkoShitenCd; // ゆうちょ銀行 通帳記号
    private String yuchoKigoSix;// ゆうちょ銀行 通帳記号 6桁目
    @CustomizeTypeSizeString(max = 8, regexp = "", message = "E00001", params = "{yuchoKozaNo.label;max.8;enter.event}")
    private String yuchoKozaNo;// ゆうちょ銀行 通帳番号
    private String yuchoFurikaeKaishiNeng;// ゆうちょ銀行 払込開始(変更)月 年号
    private String yuchoFurikaeKaishiNen ; // ゆうちょ銀行 払込開始(変更)月 年
    private String yuchoFurikaeKaishiTuki;// ゆうちょ銀行 払込開始(変更)月 月

	private String requestFormInstallationOmission; // 依頼書取付省略

	//H_SHUMOKU　火災
	private String hShumoku;//H_SHUMOKU;



	public String gethShumoku() {
		return hShumoku;
	}
	public void sethShumoku(String hShumoku) {
		this.hShumoku = hShumoku;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getPdfType() {
		return pdfType;
	}
	public void setPdfType(String pdfType) {
		this.pdfType = pdfType;
	}
	public String getInsatuNo() {
		return insatuNo;
	}
	public void setInsatuNo(String insatuNo) {
		this.insatuNo = insatuNo;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public String getKashoCd() {
		return kashoCd;
	}
	public void setKashoCd(String kashoCd) {
		this.kashoCd = kashoCd;
	}
	public String getDairitenCd() {
		return dairitenCd;
	}
	public void setDairitenCd(String dairitenCd) {
		this.dairitenCd = dairitenCd;
	}
	public String getShikiNeng() {
		return shikiNeng;
	}
	public void setShikiNeng(String shikiNeng) {
		this.shikiNeng = shikiNeng;
	}
	public String getShikiNen() {
		return shikiNen;
	}
	public void setShikiNen(String shikiNen) {
		this.shikiNen = shikiNen;
	}
	public String getShikiTuki() {
		return shikiTuki;
	}
	public void setShikiTuki(String shikiTuki) {
		this.shikiTuki = shikiTuki;
	}
	public String getShikiHi() {
		return shikiHi;
	}
	public void setShikiHi(String shikiHi) {
		this.shikiHi = shikiHi;
	}
	public String getShikiNenkan() {
		return shikiNenkan;
	}
	public void setShikiNenkan(String shikiNenkan) {
		this.shikiNenkan = shikiNenkan;
	}
	public String getKnameK() {
		return knameK;
	}
	public void setKnameK(String knameK) {
		this.knameK = knameK;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getHaraiHoho() {
		return haraiHoho;
	}
	public void setHaraiHoho(String haraiHoho) {
		this.haraiHoho = haraiHoho;
	}
	public String getIdoUkeKbn() {
		return idoUkeKbn;
	}
	public void setIdoUkeKbn(String idoUkeKbn) {
		this.idoUkeKbn = idoUkeKbn;
	}
	public String getIraiNeng() {
		return iraiNeng;
	}
	public void setIraiNeng(String iraiNeng) {
		this.iraiNeng = iraiNeng;
	}
	public String getIraiNen() {
		return iraiNen;
	}
	public void setIraiNen(String iraiNen) {
		this.iraiNen = iraiNen;
	}
	public String getIraiTuki() {
		return iraiTuki;
	}
	public void setIraiTuki(String iraiTuki) {
		this.iraiTuki = iraiTuki;
	}
	public String getIraiHi() {
		return iraiHi;
	}
	public void setIraiHi(String iraiHi) {
		this.iraiHi = iraiHi;
	}
	public String getYokinshaMeiK() {
		return yokinshaMeiK;
	}
	public void setYokinshaMeiK(String yokinshaMeiK) {
		this.yokinshaMeiK = yokinshaMeiK;
	}
	public String getYokinshaMei() {
		return yokinshaMei;
	}
	public void setYokinshaMei(String yokinshaMei) {
		this.yokinshaMei = yokinshaMei;
	}
	public String getGinkoCd() {
		return ginkoCd;
	}
	public void setGinkoCd(String ginkoCd) {
		this.ginkoCd = ginkoCd;
	}
	public String getGinkoShitenCd() {
		return ginkoShitenCd;
	}
	public void setGinkoShitenCd(String ginkoShitenCd) {
		this.ginkoShitenCd = ginkoShitenCd;
	}
	public String getYokinShurui() {
		return yokinShurui;
	}
	public void setYokinShurui(String yokinShurui) {
		this.yokinShurui = yokinShurui;
	}
	public String getKozaNo() {
		return kozaNo;
	}
	public void setKozaNo(String kozaNo) {
		this.kozaNo = kozaNo;
	}
	public String getFurikaeCd() {
		return furikaeCd;
	}
	public void setFurikaeCd(String furikaeCd) {
		this.furikaeCd = furikaeCd;
	}
	public String getFurikaeKaishiNeng() {
		return furikaeKaishiNeng;
	}
	public void setFurikaeKaishiNeng(String furikaeKaishiNeng) {
		this.furikaeKaishiNeng = furikaeKaishiNeng;
	}
	public String getFurikaeKaishiNen() {
		return furikaeKaishiNen;
	}
	public void setFurikaeKaishiNen(String furikaeKaishiNen) {
		this.furikaeKaishiNen = furikaeKaishiNen;
	}
	public String getFurikaeKaishiTuki() {
		return furikaeKaishiTuki;
	}
	public void setFurikaeKaishiTuki(String furikaeKaishiTuki) {
		this.furikaeKaishiTuki = furikaeKaishiTuki;
	}
	public String getRyoshuHangakiFuyo() {
		return ryoshuHangakiFuyo;
	}
	public void setRyoshuHangakiFuyo(String ryoshuHangakiFuyo) {
		this.ryoshuHangakiFuyo = ryoshuHangakiFuyo;
	}
	public String getIchikaibunHokenryoShu() {
		return ichikaibunHokenryoShu;
	}
	public void setIchikaibunHokenryoShu(String ichikaibunHokenryoShu) {
		this.ichikaibunHokenryoShu = ichikaibunHokenryoShu;
	}
	public String getIchikaibunHokenryoJi() {
		return ichikaibunHokenryoJi;
	}
	public void setIchikaibunHokenryoJi(String ichikaibunHokenryoJi) {
		this.ichikaibunHokenryoJi = ichikaibunHokenryoJi;
	}
	public String getKashoMeiK() {
		return kashoMeiK;
	}
	public void setKashoMeiK(String kashoMeiK) {
		this.kashoMeiK = kashoMeiK;
	}
//	public String getKashoMeiK1() {
//		return kashoMeiK1;
//	}
//	public void setKashoMeiK1(String kashoMeiK1) {
//		this.kashoMeiK1 = kashoMeiK1;
//	}
	public String getDairiMeiK() {
		return dairiMeiK;
	}
	public void setDairiMeiK(String dairiMeiK) {
		this.dairiMeiK = dairiMeiK;
	}
//	public String getDairiMeiK1() {
//		return dairiMeiK1;
//	}
//	public void setDairiMeiK1(String dairiMeiK1) {
//		this.dairiMeiK1 = dairiMeiK1;
//	}
	public String getGinkoNmKna() {
		return ginkoNmKna;
	}
	public void setGinkoNmKna(String ginkoNmKna) {
		this.ginkoNmKna = ginkoNmKna;
	}
	public String getGinkoNmKnj() {
		return ginkoNmKnj;
	}
	public void setGinkoNmKnj(String ginkoNmKnj) {
		this.ginkoNmKnj = ginkoNmKnj;
	}
//	public String getGinkoNmKnj1() {
//		return ginkoNmKnj1;
//	}
//	public void setGinkoNmKnj1(String ginkoNmKnj1) {
//		this.ginkoNmKnj1 = ginkoNmKnj1;
//	}
	public String getGinkoShitenNmKna() {
		return ginkoShitenNmKna;
	}
	public void setGinkoShitenNmKna(String ginkoShitenNmKna) {
		this.ginkoShitenNmKna = ginkoShitenNmKna;
	}
	public String getGinkoShitenNmKnj() {
		return ginkoShitenNmKnj;
	}
	public void setGinkoShitenNmKnj(String ginkoShitenNmKnj) {
		this.ginkoShitenNmKnj = ginkoShitenNmKnj;
	}
//	public String getGinkoShitenNmKnj1() {
//		return ginkoShitenNmKnj1;
//	}
//	public void setGinkoShitenNmKnj1(String ginkoShitenNmKnj1) {
//		this.ginkoShitenNmKnj1 = ginkoShitenNmKnj1;
//	}
	public String getYuchoGinkoShitenCd() {
		return yuchoGinkoShitenCd;
	}
	public void setYuchoGinkoShitenCd(String yuchoGinkoShitenCd) {
		this.yuchoGinkoShitenCd = yuchoGinkoShitenCd;
	}
	public String getYuchoKigoSix() {
		return yuchoKigoSix;
	}
	public void setYuchoKigoSix(String yuchoKigoSix) {
		this.yuchoKigoSix = yuchoKigoSix;
	}
	public String getYuchoKozaNo() {
		return yuchoKozaNo;
	}
	public void setYuchoKozaNo(String yuchoKozaNo) {
		this.yuchoKozaNo = yuchoKozaNo;
	}
	public String getYuchoFurikaeKaishiNeng() {
		return yuchoFurikaeKaishiNeng;
	}
	public void setYuchoFurikaeKaishiNeng(String yuchoFurikaeKaishiNeng) {
		this.yuchoFurikaeKaishiNeng = yuchoFurikaeKaishiNeng;
	}
	public String getYuchoFurikaeKaishiNen() {
		return yuchoFurikaeKaishiNen;
	}
	public void setYuchoFurikaeKaishiNen(String yuchoFurikaeKaishiNen) {
		this.yuchoFurikaeKaishiNen = yuchoFurikaeKaishiNen;
	}
	public String getYuchoFurikaeKaishiTuki() {
		return yuchoFurikaeKaishiTuki;
	}
	public void setYuchoFurikaeKaishiTuki(String yuchoFurikaeKaishiTuki) {
		this.yuchoFurikaeKaishiTuki = yuchoFurikaeKaishiTuki;
	}



	public String getRequestFormInstallationOmission() {
		return requestFormInstallationOmission;
	}
	public void setRequestFormInstallationOmission(String requestFormInstallationOmission) {
		this.requestFormInstallationOmission = requestFormInstallationOmission;
	}
	public String toString() {
		StringBuffer log = new StringBuffer();
		log.append("\n"+this.getClass().getName()+ "\n");
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				Object v = field.get(this);
				if (v != null) {
					log.append(field.getName() + ":" + v.toString() + "\n");
				} else {
					log.append(field.getName() + ":" + " null " + "\n");
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		return log.toString();
	}

}