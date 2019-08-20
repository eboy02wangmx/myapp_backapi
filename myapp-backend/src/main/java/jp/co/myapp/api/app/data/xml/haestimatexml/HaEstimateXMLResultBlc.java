package jp.co.myapp.api.app.data.xml.haestimatexml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResultBlc")
public class HaEstimateXMLResultBlc {

	/**
	 * 地震適用料率(jishinTekiyoRate)
	 */
	private String jishinTekiyoRate;

	/**
	 * 建物保険料(tatemonoPrem)
	 */
	private String tatemonoPrem;

	/**
	 * 家財保険料(kazaiPrem)
	 */
	private String kazaiPrem;

	/**
	 * 設備什器保険料(setsubiJukiPrem)
	 */
	private String setsubiJukiPrem;

	/**
	 * 商品製品保険料(shohinSeihinPrem)
	 */
	private String shohinSeihinPrem;

	/**
	 * 明記物件保険料(meikiBukkenPrem)
	 */
	private String meikiBukkenPrem;

	/**
	 * 建物地震保険料(jishinTatemonoPrem)
	 */
	private String jishinTatemonoPrem;

	/**
	 * 家財地震保険料(jishinKazaiPrem)
	 */
	private String jishinKazaiPrem;

	/**
	 * 個人賠償保険料(kojinBaishoPrem)
	 */
	private String kojinBaishoPrem;

	/**
	 * 借家人賠償保険料(shakkaninBaishoPrem)
	 */
	private String shakkaninBaishoPrem;

	/**
	 * 類焼保険料(ruishoPrem)
	 */
	private String ruishoPrem;

	/**
	 * 合計保険料(gokeiPrem)
	 */
	private String gokeiPrem;

	/**
	 * 年額保険料(nengakuPrem)
	 */
	private String nengakuPrem;

	/**
	 * 初回保険料(shokaiPrem)
	 */
	private String shokaiPrem;

	/**
	 * 建物管理賠責保険料(tatemonoKanriBaishoPrem)
	 */
	private String tatemonoKanriBaishoPrem;

	/**
	 * 地震適用料率(jishinTekiyoRate)の取得
	 *
	 * @return jishinTekiyoRate
	 */
	@XmlElement(name = "JishinTekiyoRate")
	public String getJishinTekiyoRate() {
		return this.jishinTekiyoRate;
	}

	/**
	 * 地震適用料率(jishinTekiyoRate)の設定
	 *
	 * @param jishinTekiyoRate
	 *            String
	 */
	public void setJishinTekiyoRate(String jishinTekiyoRate) {
		this.jishinTekiyoRate = jishinTekiyoRate;
	}

	/**
	 * 建物保険料(tatemonoPrem)の取得
	 *
	 * @return tatemonoPrem
	 */
	@XmlElement(name = "TatemonoPrem")
	public String getTatemonoPrem() {
		return this.tatemonoPrem;
	}

	/**
	 * 建物保険料(tatemonoPrem)の設定
	 *
	 * @param tatemonoPrem
	 *            String
	 */
	public void setTatemonoPrem(String tatemonoPrem) {
		this.tatemonoPrem = tatemonoPrem;
	}

	/**
	 * 家財保険料(kazaiPrem)の取得
	 *
	 * @return kazaiPrem
	 */
	@XmlElement(name = "KazaiPrem")
	public String getKazaiPrem() {
		return this.kazaiPrem;
	}

	/**
	 * 家財保険料(kazaiPrem)の設定
	 *
	 * @param kazaiPrem
	 *            String
	 */
	public void setKazaiPrem(String kazaiPrem) {
		this.kazaiPrem = kazaiPrem;
	}

	/**
	 * 設備什器保険料(setsubiJukiPrem)の取得
	 *
	 * @return setsubiJukiPrem
	 */
	@XmlElement(name = "SetsubiJukiPrem")
	public String getSetsubiJukiPrem() {
		return this.setsubiJukiPrem;
	}

	/**
	 * 設備什器保険料(setsubiJukiPrem)の設定
	 *
	 * @param setsubiJukiPrem
	 *            String
	 */
	public void setSetsubiJukiPrem(String setsubiJukiPrem) {
		this.setsubiJukiPrem = setsubiJukiPrem;
	}

	/**
	 * 商品製品保険料(shohinSeihinPrem)の取得
	 *
	 * @return shohinSeihinPrem
	 */
	@XmlElement(name = "ShohinSeihinPrem")
	public String getShohinSeihinPrem() {
		return this.shohinSeihinPrem;
	}

	/**
	 * 商品製品保険料(shohinSeihinPrem)の設定
	 *
	 * @param shohinSeihinPrem
	 *            String
	 */
	public void setShohinSeihinPrem(String shohinSeihinPrem) {
		this.shohinSeihinPrem = shohinSeihinPrem;
	}

	/**
	 * 明記物件保険料(meikiBukkenPrem)の取得
	 *
	 * @return meikiBukkenPrem
	 */
	@XmlElement(name = "MeikiBukkenPrem")
	public String getMeikiBukkenPrem() {
		return this.meikiBukkenPrem;
	}

	/**
	 * 明記物件保険料(meikiBukkenPrem)の設定
	 *
	 * @param meikiBukkenPrem
	 *            String
	 */
	public void setMeikiBukkenPrem(String meikiBukkenPrem) {
		this.meikiBukkenPrem = meikiBukkenPrem;
	}

	/**
	 * 建物地震保険料(jishinTatemonoPrem)の取得
	 *
	 * @return jishinTatemonoPrem
	 */
	@XmlElement(name = "JishinTatemonoPrem")
	public String getJishinTatemonoPrem() {
		return this.jishinTatemonoPrem;
	}

	/**
	 * 建物地震保険料(jishinTatemonoPrem)の設定
	 *
	 * @param jishinTatemonoPrem
	 *            String
	 */
	public void setJishinTatemonoPrem(String jishinTatemonoPrem) {
		this.jishinTatemonoPrem = jishinTatemonoPrem;
	}

	/**
	 * 家財地震保険料(jishinKazaiPrem)の取得
	 *
	 * @return jishinKazaiPrem
	 */
	@XmlElement(name = "JishinKazaiPrem")
	public String getJishinKazaiPrem() {
		return this.jishinKazaiPrem;
	}

	/**
	 * 家財地震保険料(jishinKazaiPrem)の設定
	 *
	 * @param jishinKazaiPrem
	 *            String
	 */
	public void setJishinKazaiPrem(String jishinKazaiPrem) {
		this.jishinKazaiPrem = jishinKazaiPrem;
	}

	/**
	 * 個人賠償保険料(kojinBaishoPrem)の取得
	 *
	 * @return kojinBaishoPrem
	 */
	@XmlElement(name = "KojinBaishoPrem")
	public String getKojinBaishoPrem() {
		return this.kojinBaishoPrem;
	}

	/**
	 * 個人賠償保険料(kojinBaishoPrem)の設定
	 *
	 * @param kojinBaishoPrem
	 *            String
	 */
	public void setKojinBaishoPrem(String kojinBaishoPrem) {
		this.kojinBaishoPrem = kojinBaishoPrem;
	}

	/**
	 * 借家人賠償保険料(shakkaninBaishoPrem)の取得
	 *
	 * @return shakkaninBaishoPrem
	 */
	@XmlElement(name = "ShakkaninBaishoPrem")
	public String getShakkaninBaishoPrem() {
		return this.shakkaninBaishoPrem;
	}

	/**
	 * 借家人賠償保険料(shakkaninBaishoPrem)の設定
	 *
	 * @param shakkaninBaishoPrem
	 *            String
	 */
	public void setShakkaninBaishoPrem(String shakkaninBaishoPrem) {
		this.shakkaninBaishoPrem = shakkaninBaishoPrem;
	}

	/**
	 * 類焼保険料(ruishoPrem)の取得
	 *
	 * @return ruishoPrem
	 */
	@XmlElement(name = "RuishoPrem")
	public String getRuishoPrem() {
		return this.ruishoPrem;
	}

	/**
	 * 類焼保険料(ruishoPrem)の設定
	 *
	 * @param ruishoPrem
	 *            String
	 */
	public void setRuishoPrem(String ruishoPrem) {
		this.ruishoPrem = ruishoPrem;
	}

	/**
	 * 合計保険料(gokeiPrem)の取得
	 *
	 * @return gokeiPrem
	 */
	@XmlElement(name = "GokeiPrem")
	public String getGokeiPrem() {
		return this.gokeiPrem;
	}

	/**
	 * 合計保険料(gokeiPrem)の設定
	 *
	 * @param gokeiPrem
	 *            String
	 */
	public void setGokeiPrem(String gokeiPrem) {
		this.gokeiPrem = gokeiPrem;
	}

	/**
	 * 年額保険料(nengakuPrem)の取得
	 *
	 * @return nengakuPrem
	 */
	@XmlElement(name = "NengakuPrem")
	public String getNengakuPrem() {
		return this.nengakuPrem;
	}

	/**
	 * 年額保険料(nengakuPrem)の設定
	 *
	 * @param nengakuPrem
	 *            String
	 */
	public void setNengakuPrem(String nengakuPrem) {
		this.nengakuPrem = nengakuPrem;
	}

	/**
	 * 初回保険料(shokaiPrem)の取得
	 *
	 * @return shokaiPrem
	 */
	@XmlElement(name = "ShokaiPrem")
	public String getShokaiPrem() {
		return this.shokaiPrem;
	}

	/**
	 * 初回保険料(shokaiPrem)の設定
	 *
	 * @param shokaiPrem
	 *            String
	 */
	public void setShokaiPrem(String shokaiPrem) {
		this.shokaiPrem = shokaiPrem;
	}

	/**
	 * 建物管理賠償保険料(tatemonoKanriBaishoPrem)の取得
	 *
	 * @return tatemonoKanriBaishoPrem
	 */
	@XmlElement(name = "TatemonoKanriBaishoPrem")
	public String getTatemonoKanriBaishoPrem() {
		return this.tatemonoKanriBaishoPrem;
	}

	/**
	 * 建物管理賠償保険料(tatemonoKanriBaishoPrem)の設定
	 *
	 * @param tatemonoKanriBaishoPrem
	 *            String
	 */
	public void setTatemonoKanriBaishoPrem(String tatemonoKanriBaishoPrem) {
		this.tatemonoKanriBaishoPrem = tatemonoKanriBaishoPrem;
	}

}
