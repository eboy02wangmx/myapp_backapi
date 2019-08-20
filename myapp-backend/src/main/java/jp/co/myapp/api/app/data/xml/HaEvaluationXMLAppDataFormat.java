package jp.co.myapp.api.app.data.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AppDataFormat")
public class HaEvaluationXMLAppDataFormat {

	/**
	 * 保険始期(hokenShiki)
	 */
	private String hokenShiki;

	/**
	 * 保険の対象(hokenTaisho)
	 */
	private String hokenTaisho;

	/**
	 * 保険の対象の所在地(taishoShozaichi)
	 */
	private String taishoShozaichi;

	/**
	 * 構造級別(kozoKyubetsu)
	 */
	private String kozoKyubetsu;

	/**
	 * 用法(yoho)
	 */
	private String yoho;

	/**
	 * 所有区分(shoyuKubun)
	 */
	private String shoyuKubun;

	/**
	 * マンション(mansion)
	 */
	private String mansion;

	/**
	 * マンション１(mansion1)
	 */
	private String mansion1;

	/**
	 * マンション２(mansion2)
	 */
	private String mansion2;

	/**
	 * 概観法(gaikanHo)
	 */
	private String gaikanHo;

	/**
	 * 取得年次法(shutokuNenjiHo)
	 */
	private String shutokuNenjiHo;

	/**
	 * その他の評価法(sonotaHyokaHo)
	 */
	private String sonotaHyokaHo;

	/**
	 * 占有面積(sennyuMenseki)
	 */
	private String sennyuMenseki;

	/**
	 * 門・へい・車庫価額(monHeiShakoKagaku)
	 */
	private String monHeiShakoKagaku;

	/**
	 * 建物調整率(tatemonoChoseiRitsu)
	 */
	private String tatemonoChoseiRitsu;

	/**
	 * 建築時の取得価額(shutokuKagaku)
	 */
	private String shutokuKagaku;

	/**
	 * 建物建築年(kenchikuYear)
	 */
	private String kenchikuYear;

	/**
	 * 建物建築月(kenchikuMonth)
	 */
	private String kenchikuMonth;

	/**
	 * その他の評価法建物評価額(sonotaTatemonoHyokaGaku)
	 */
	private String sonotaTatemonoHyokaGaku;

	/**
	 * 建物基礎(tatemonoKiso)
	 */
	private String tatemonoKiso;

	/**
	 * 世帯主年令(setainushiNenrei)
	 */
	private String setainushiNenrei;

	/**
	 * 配偶者有(haigushaAri)
	 */
	private String haigushaAri;

	/**
	 * 子供人数(kodomoNinzu)
	 */
	private String kodomoNinzu;

	/**
	 * 他人数(sonotaNinzu)
	 */
	private String sonotaNinzu;

	/**
	 * 家財調整率(kazaiChoseiRitsu)
	 */
	private String kazaiChoseiRitsu;

	/**
	 * 入力家財評価額(nyuryokuKazaiHyokagaku)
	 */
	private String nyuryokuKazaiHyokagaku;

	/**
	 * 他の保険の対象１(sonotaHokenTaisho_0)
	 */
	private String sonotaHokenTaisho0;

	/**
	 * 他の保険基本保険金額１(sonotaHokenKihonAmt_0)
	 */
	private String sonotaHokenKihonAmt0;

	/**
	 * 他の保険地震保険金額１(sonotaHokenJishinAmt_0)
	 */
	private String sonotaHokenJishinAmt0;

	/**
	 * 他の保険の対象２(sonotaHokenTaisho_1)
	 */
	private String sonotaHokenTaisho1;

	/**
	 * 他の保険基本保険金額２(sonotaHokenKihonAmt_1)
	 */
	private String sonotaHokenKihonAmt1;

	/**
	 * 他の保険地震保険金額２(sonotaHokenJishinAmt_1)
	 */
	private String sonotaHokenJishinAmt1;

	/**
	 * 他の保険の対象３(sonotaHokenTaisho_2)
	 */
	private String sonotaHokenTaisho2;

	/**
	 * 他の保険基本保険金額３(sonotaHokenKihonAmt_2)
	 */
	private String sonotaHokenKihonAmt2;

	/**
	 * 他の保険地震保険金額３(sonotaHokenJishinAmt_2)
	 */
	private String sonotaHokenJishinAmt2;

	/**
	 * 評価額単位(hyokagakuUnit)
	 */
	private String hyokagakuUnit;

	/**
	 * 調整率範囲内指定フラグ(choseiRitsuHaniShitei)
	 */
	private String choseiRitsuHaniShitei;

	/**
	 * 建物のみ評価額
	（調整率範囲内指定）(tatemonoNomiHyokaGakuShitei)
	 */
	private String tatemonoNomiHyokaGakuShitei;

	/**
	 * 保険始期(hokenShiki)の取得
	 * @return hokenShiki
	 */
	@XmlElement(name="HokenShiki")
	public String getHokenShiki() {
	    return this.hokenShiki;
	}
	/**
	 * 保険始期(hokenShiki)の設定
	 * @param hokenShiki String
	 */
	public void setHokenShiki(String hokenShiki) {
	    this.hokenShiki = hokenShiki;
	}

	/**
	 * 保険の対象(hokenTaisho)の取得
	 * @return hokenTaisho
	 */
	@XmlElement(name="HokenTaisho")
	public String getHokenTaisho() {
	    return this.hokenTaisho;
	}
	/**
	 * 保険の対象(hokenTaisho)の設定
	 * @param hokenTaisho String
	 */
	public void setHokenTaisho(String hokenTaisho) {
	    this.hokenTaisho = hokenTaisho;
	}

	/**
	 * 保険の対象の所在地(taishoShozaichi)の取得
	 * @return taishoShozaichi
	 */
	@XmlElement(name="TaishoShozaichi")
	public String getTaishoShozaichi() {
	    return this.taishoShozaichi;
	}
	/**
	 * 保険の対象の所在地(taishoShozaichi)の設定
	 * @param taishoShozaichi String
	 */
	public void setTaishoShozaichi(String taishoShozaichi) {
	    this.taishoShozaichi = taishoShozaichi;
	}

	/**
	 * 構造級別(kozoKyubetsu)の取得
	 * @return kozoKyubetsu
	 */
	@XmlElement(name="KozoKyubetsu")
	public String getKozoKyubetsu() {
	    return this.kozoKyubetsu;
	}
	/**
	 * 構造級別(kozoKyubetsu)の設定
	 * @param kozoKyubetsu String
	 */
	public void setKozoKyubetsu(String kozoKyubetsu) {
	    this.kozoKyubetsu = kozoKyubetsu;
	}

	/**
	 * 用法(yoho)の取得
	 * @return yoho
	 */
	@XmlElement(name="Yoho")
	public String getYoho() {
	    return this.yoho;
	}
	/**
	 * 用法(yoho)の設定
	 * @param yoho String
	 */
	public void setYoho(String yoho) {
	    this.yoho = yoho;
	}

	/**
	 * 所有区分(shoyuKubun)の取得
	 * @return shoyuKubun
	 */
	@XmlElement(name="ShoyuKubun")
	public String getShoyuKubun() {
	    return this.shoyuKubun;
	}
	/**
	 * 所有区分(shoyuKubun)の設定
	 * @param shoyuKubun String
	 */
	public void setShoyuKubun(String shoyuKubun) {
	    this.shoyuKubun = shoyuKubun;
	}

	/**
	 * マンション(mansion)の取得
	 * @return mansion
	 */
	@XmlElement(name="Mansion")
	public String getMansion() {
	    return this.mansion;
	}
	/**
	 * マンション(mansion)の設定
	 * @param mansion String
	 */
	public void setMansion(String mansion) {
	    this.mansion = mansion;
	}

	/**
	 * マンション１(mansion1)の取得
	 * @return mansion1
	 */
	@XmlElement(name="Mansion1")
	public String getMansion1() {
	    return this.mansion1;
	}
	/**
	 * マンション１(mansion1)の設定
	 * @param mansion1 String
	 */
	public void setMansion1(String mansion1) {
	    this.mansion1 = mansion1;
	}

	/**
	 * マンション２(mansion2)の取得
	 * @return mansion2
	 */
	@XmlElement(name="Mansion2")
	public String getMansion2() {
	    return this.mansion2;
	}
	/**
	 * マンション２(mansion2)の設定
	 * @param mansion2 String
	 */
	public void setMansion2(String mansion2) {
	    this.mansion2 = mansion2;
	}

	/**
	 * 概観法(gaikanHo)の取得
	 * @return gaikanHo
	 */
	@XmlElement(name="GaikanHo")
	public String getGaikanHo() {
	    return this.gaikanHo;
	}
	/**
	 * 概観法(gaikanHo)の設定
	 * @param gaikanHo String
	 */
	public void setGaikanHo(String gaikanHo) {
	    this.gaikanHo = gaikanHo;
	}

	/**
	 * 取得年次法(shutokuNenjiHo)の取得
	 * @return shutokuNenjiHo
	 */
	@XmlElement(name="ShutokuNenjiHo")
	public String getShutokuNenjiHo() {
	    return this.shutokuNenjiHo;
	}
	/**
	 * 取得年次法(shutokuNenjiHo)の設定
	 * @param shutokuNenjiHo String
	 */
	public void setShutokuNenjiHo(String shutokuNenjiHo) {
	    this.shutokuNenjiHo = shutokuNenjiHo;
	}

	/**
	 * その他の評価法(sonotaHyokaHo)の取得
	 * @return sonotaHyokaHo
	 */
	@XmlElement(name="SonotaHyokaHo")
	public String getSonotaHyokaHo() {
	    return this.sonotaHyokaHo;
	}
	/**
	 * その他の評価法(sonotaHyokaHo)の設定
	 * @param sonotaHyokaHo String
	 */
	public void setSonotaHyokaHo(String sonotaHyokaHo) {
	    this.sonotaHyokaHo = sonotaHyokaHo;
	}

	/**
	 * 占有面積(sennyuMenseki)の取得
	 * @return sennyuMenseki
	 */
	@XmlElement(name="SennyuMenseki")
	public String getSennyuMenseki() {
	    return this.sennyuMenseki;
	}
	/**
	 * 占有面積(sennyuMenseki)の設定
	 * @param sennyuMenseki String
	 */
	public void setSennyuMenseki(String sennyuMenseki) {
	    this.sennyuMenseki = sennyuMenseki;
	}

	/**
	 * 門・へい・車庫価額(monHeiShakoKagaku)の取得
	 * @return monHeiShakoKagaku
	 */
	@XmlElement(name="MonHeiShakoKagaku")
	public String getMonHeiShakoKagaku() {
	    return this.monHeiShakoKagaku;
	}
	/**
	 * 門・へい・車庫価額(monHeiShakoKagaku)の設定
	 * @param monHeiShakoKagaku String
	 */
	public void setMonHeiShakoKagaku(String monHeiShakoKagaku) {
	    this.monHeiShakoKagaku = monHeiShakoKagaku;
	}

	/**
	 * 建物調整率(tatemonoChoseiRitsu)の取得
	 * @return tatemonoChoseiRitsu
	 */
	@XmlElement(name="TatemonoChoseiRitsu")
	public String getTatemonoChoseiRitsu() {
	    return this.tatemonoChoseiRitsu;
	}
	/**
	 * 建物調整率(tatemonoChoseiRitsu)の設定
	 * @param tatemonoChoseiRitsu String
	 */
	public void setTatemonoChoseiRitsu(String tatemonoChoseiRitsu) {
	    this.tatemonoChoseiRitsu = tatemonoChoseiRitsu;
	}

	/**
	 * 建築時の取得価額(shutokuKagaku)の取得
	 * @return shutokuKagaku
	 */
	@XmlElement(name="ShutokuKagaku")
	public String getShutokuKagaku() {
	    return this.shutokuKagaku;
	}
	/**
	 * 建築時の取得価額(shutokuKagaku)の設定
	 * @param shutokuKagaku String
	 */
	public void setShutokuKagaku(String shutokuKagaku) {
	    this.shutokuKagaku = shutokuKagaku;
	}

	/**
	 * 建物建築年(kenchikuYear)の取得
	 * @return kenchikuYear
	 */
	@XmlElement(name="KenchikuYear")
	public String getKenchikuYear() {
	    return this.kenchikuYear;
	}
	/**
	 * 建物建築年(kenchikuYear)の設定
	 * @param kenchikuYear String
	 */
	public void setKenchikuYear(String kenchikuYear) {
	    this.kenchikuYear = kenchikuYear;
	}

	/**
	 * 建物建築月(kenchikuMonth)の取得
	 * @return kenchikuMonth
	 */
	@XmlElement(name="KenchikuMonth")
	public String getKenchikuMonth() {
	    return this.kenchikuMonth;
	}
	/**
	 * 建物建築月(kenchikuMonth)の設定
	 * @param kenchikuMonth String
	 */
	public void setKenchikuMonth(String kenchikuMonth) {
	    this.kenchikuMonth = kenchikuMonth;
	}

	/**
	 * その他の評価法建物評価額(sonotaTatemonoHyokaGaku)の取得
	 * @return sonotaTatemonoHyokaGaku
	 */
	@XmlElement(name="SonotaTatemonoHyokaGaku")
	public String getSonotaTatemonoHyokaGaku() {
	    return this.sonotaTatemonoHyokaGaku;
	}
	/**
	 * その他の評価法建物評価額(sonotaTatemonoHyokaGaku)の設定
	 * @param sonotaTatemonoHyokaGaku String
	 */
	public void setSonotaTatemonoHyokaGaku(String sonotaTatemonoHyokaGaku) {
	    this.sonotaTatemonoHyokaGaku = sonotaTatemonoHyokaGaku;
	}

	/**
	 * 建物基礎(tatemonoKiso)の取得
	 * @return tatemonoKiso
	 */
	@XmlElement(name="TatemonoKiso")
	public String getTatemonoKiso() {
	    return this.tatemonoKiso;
	}
	/**
	 * 建物基礎(tatemonoKiso)の設定
	 * @param tatemonoKiso String
	 */
	public void setTatemonoKiso(String tatemonoKiso) {
	    this.tatemonoKiso = tatemonoKiso;
	}

	/**
	 * 世帯主年令(setainushiNenrei)の取得
	 * @return setainushiNenrei
	 */
	@XmlElement(name="SetainushiNenrei")
	public String getSetainushiNenrei() {
	    return this.setainushiNenrei;
	}
	/**
	 * 世帯主年令(setainushiNenrei)の設定
	 * @param setainushiNenrei String
	 */
	public void setSetainushiNenrei(String setainushiNenrei) {
	    this.setainushiNenrei = setainushiNenrei;
	}

	/**
	 * 配偶者有(haigushaAri)の取得
	 * @return haigushaAri
	 */
	@XmlElement(name="HaigushaAri")
	public String getHaigushaAri() {
	    return this.haigushaAri;
	}
	/**
	 * 配偶者有(haigushaAri)の設定
	 * @param haigushaAri String
	 */
	public void setHaigushaAri(String haigushaAri) {
	    this.haigushaAri = haigushaAri;
	}

	/**
	 * 子供人数(kodomoNinzu)の取得
	 * @return kodomoNinzu
	 */
	@XmlElement(name="KodomoNinzu")
	public String getKodomoNinzu() {
	    return this.kodomoNinzu;
	}
	/**
	 * 子供人数(kodomoNinzu)の設定
	 * @param kodomoNinzu String
	 */
	public void setKodomoNinzu(String kodomoNinzu) {
	    this.kodomoNinzu = kodomoNinzu;
	}

	/**
	 * 他人数(sonotaNinzu)の取得
	 * @return sonotaNinzu
	 */
	@XmlElement(name="SonotaNinzu")
	public String getSonotaNinzu() {
	    return this.sonotaNinzu;
	}
	/**
	 * 他人数(sonotaNinzu)の設定
	 * @param sonotaNinzu String
	 */
	public void setSonotaNinzu(String sonotaNinzu) {
	    this.sonotaNinzu = sonotaNinzu;
	}

	/**
	 * 家財調整率(kazaiChoseiRitsu)の取得
	 * @return kazaiChoseiRitsu
	 */
	@XmlElement(name="KazaiChoseiRitsu")
	public String getKazaiChoseiRitsu() {
	    return this.kazaiChoseiRitsu;
	}
	/**
	 * 家財調整率(kazaiChoseiRitsu)の設定
	 * @param kazaiChoseiRitsu String
	 */
	public void setKazaiChoseiRitsu(String kazaiChoseiRitsu) {
	    this.kazaiChoseiRitsu = kazaiChoseiRitsu;
	}

	/**
	 * 入力家財評価額(nyuryokuKazaiHyokagaku)の取得
	 * @return nyuryokuKazaiHyokagaku
	 */
	@XmlElement(name="NyuryokuKazaiHyokagaku")
	public String getNyuryokuKazaiHyokagaku() {
	    return this.nyuryokuKazaiHyokagaku;
	}
	/**
	 * 入力家財評価額(nyuryokuKazaiHyokagaku)の設定
	 * @param nyuryokuKazaiHyokagaku String
	 */
	public void setNyuryokuKazaiHyokagaku(String nyuryokuKazaiHyokagaku) {
	    this.nyuryokuKazaiHyokagaku = nyuryokuKazaiHyokagaku;
	}

	/**
	 * 他の保険の対象１(sonotaHokenTaisho_0)の取得
	 * @return sonotaHokenTaisho0
	 */
	@XmlElement(name="SonotaHokenTaisho_0")
	public String getSonotaHokenTaisho0() {
	    return this.sonotaHokenTaisho0;
	}
	/**
	 * 他の保険の対象１(sonotaHokenTaisho_0)の設定
	 * @param sonotaHokenTaisho0 String
	 */
	public void setSonotaHokenTaisho0(String sonotaHokenTaisho0) {
	    this.sonotaHokenTaisho0 = sonotaHokenTaisho0;
	}

	/**
	 * 他の保険基本保険金額１(sonotaHokenKihonAmt_0)の取得
	 * @return sonotaHokenKihonAmt0
	 */
	@XmlElement(name="SonotaHokenKihonAmt_0")
	public String getSonotaHokenKihonAmt0() {
	    return this.sonotaHokenKihonAmt0;
	}
	/**
	 * 他の保険基本保険金額１(sonotaHokenKihonAmt_0)の設定
	 * @param sonotaHokenKihonAmt0 String
	 */
	public void setSonotaHokenKihonAmt0(String sonotaHokenKihonAmt0) {
	    this.sonotaHokenKihonAmt0 = sonotaHokenKihonAmt0;
	}

	/**
	 * 他の保険地震保険金額１(sonotaHokenJishinAmt_0)の取得
	 * @return sonotaHokenJishinAmt0
	 */
	@XmlElement(name="SonotaHokenJishinAmt_0")
	public String getSonotaHokenJishinAmt0() {
	    return this.sonotaHokenJishinAmt0;
	}
	/**
	 * 他の保険地震保険金額１(sonotaHokenJishinAmt_0)の設定
	 * @param sonotaHokenJishinAmt0 String
	 */
	public void setSonotaHokenJishinAmt0(String sonotaHokenJishinAmt0) {
	    this.sonotaHokenJishinAmt0 = sonotaHokenJishinAmt0;
	}

	/**
	 * 他の保険の対象２(sonotaHokenTaisho_1)の取得
	 * @return sonotaHokenTaisho1
	 */
	@XmlElement(name="SonotaHokenTaisho_1")
	public String getSonotaHokenTaisho1() {
	    return this.sonotaHokenTaisho1;
	}
	/**
	 * 他の保険の対象２(sonotaHokenTaisho_1)の設定
	 * @param sonotaHokenTaisho1 String
	 */
	public void setSonotaHokenTaisho1(String sonotaHokenTaisho1) {
	    this.sonotaHokenTaisho1 = sonotaHokenTaisho1;
	}

	/**
	 * 他の保険基本保険金額２(sonotaHokenKihonAmt_1)の取得
	 * @return sonotaHokenKihonAmt1
	 */
	@XmlElement(name="SonotaHokenKihonAmt_1")
	public String getSonotaHokenKihonAmt1() {
	    return this.sonotaHokenKihonAmt1;
	}
	/**
	 * 他の保険基本保険金額２(sonotaHokenKihonAmt_1)の設定
	 * @param sonotaHokenKihonAmt1 String
	 */
	public void setSonotaHokenKihonAmt1(String sonotaHokenKihonAmt1) {
	    this.sonotaHokenKihonAmt1 = sonotaHokenKihonAmt1;
	}

	/**
	 * 他の保険地震保険金額２(sonotaHokenJishinAmt_1)の取得
	 * @return sonotaHokenJishinAmt1
	 */
	@XmlElement(name="SonotaHokenJishinAmt_1")
	public String getSonotaHokenJishinAmt1() {
	    return this.sonotaHokenJishinAmt1;
	}
	/**
	 * 他の保険地震保険金額２(sonotaHokenJishinAmt_1)の設定
	 * @param sonotaHokenJishinAmt1 String
	 */
	public void setSonotaHokenJishinAmt1(String sonotaHokenJishinAmt1) {
	    this.sonotaHokenJishinAmt1 = sonotaHokenJishinAmt1;
	}

	/**
	 * 他の保険の対象３(sonotaHokenTaisho_2)の取得
	 * @return sonotaHokenTaisho2
	 */
	@XmlElement(name="SonotaHokenTaisho_2")
	public String getSonotaHokenTaisho2() {
	    return this.sonotaHokenTaisho2;
	}
	/**
	 * 他の保険の対象３(sonotaHokenTaisho_2)の設定
	 * @param sonotaHokenTaisho2 String
	 */
	public void setSonotaHokenTaisho2(String sonotaHokenTaisho2) {
	    this.sonotaHokenTaisho2 = sonotaHokenTaisho2;
	}

	/**
	 * 他の保険基本保険金額３(sonotaHokenKihonAmt_2)の取得
	 * @return sonotaHokenKihonAmt2
	 */
	@XmlElement(name="SonotaHokenKihonAmt_2")
	public String getSonotaHokenKihonAmt2() {
	    return this.sonotaHokenKihonAmt2;
	}
	/**
	 * 他の保険基本保険金額３(sonotaHokenKihonAmt_2)の設定
	 * @param sonotaHokenKihonAmt2 String
	 */
	public void setSonotaHokenKihonAmt2(String sonotaHokenKihonAmt2) {
	    this.sonotaHokenKihonAmt2 = sonotaHokenKihonAmt2;
	}

	/**
	 * 他の保険地震保険金額３(sonotaHokenJishinAmt_2)の取得
	 * @return sonotaHokenJishinAmt2
	 */
	@XmlElement(name="SonotaHokenJishinAmt_2")
	public String getSonotaHokenJishinAmt2() {
	    return this.sonotaHokenJishinAmt2;
	}
	/**
	 * 他の保険地震保険金額３(sonotaHokenJishinAmt_2)の設定
	 * @param sonotaHokenJishinAmt2 String
	 */
	public void setSonotaHokenJishinAmt2(String sonotaHokenJishinAmt2) {
	    this.sonotaHokenJishinAmt2 = sonotaHokenJishinAmt2;
	}

	/**
	 * 評価額単位(hyokagakuUnit)の取得
	 * @return hyokagakuUnit
	 */
	@XmlElement(name="HyokagakuUnit")
	public String getHyokagakuUnit() {
	    return this.hyokagakuUnit;
	}
	/**
	 * 評価額単位(hyokagakuUnit)の設定
	 * @param hyokagakuUnit String
	 */
	public void setHyokagakuUnit(String hyokagakuUnit) {
	    this.hyokagakuUnit = hyokagakuUnit;
	}

	/**
	 * 調整率範囲内指定フラグ(choseiRitsuHaniShitei)の取得
	 * @return choseiRitsuHaniShitei
	 */
	@XmlElement(name="ChoseiRitsuHaniShitei")
	public String getChoseiRitsuHaniShitei() {
	    return this.choseiRitsuHaniShitei;
	}
	/**
	 * 調整率範囲内指定フラグ(choseiRitsuHaniShitei)の設定
	 * @param choseiRitsuHaniShitei String
	 */
	public void setChoseiRitsuHaniShitei(String choseiRitsuHaniShitei) {
	    this.choseiRitsuHaniShitei = choseiRitsuHaniShitei;
	}

	/**
	 * 建物のみ評価額
	（調整率範囲内指定）(tatemonoNomiHyokaGakuShitei)の取得
	 * @return tatemonoNomiHyokaGakuShitei
	 */
	@XmlElement(name="TatemonoNomiHyokaGakuShitei")
	public String getTatemonoNomiHyokaGakuShitei() {
	    return this.tatemonoNomiHyokaGakuShitei;
	}
	/**
	 * 建物のみ評価額
	（調整率範囲内指定）(tatemonoNomiHyokaGakuShitei)の設定
	 * @param tatemonoNomiHyokaGakuShitei String
	 */
	public void setTatemonoNomiHyokaGakuShitei(String tatemonoNomiHyokaGakuShitei) {
	    this.tatemonoNomiHyokaGakuShitei = tatemonoNomiHyokaGakuShitei;
	}

}
