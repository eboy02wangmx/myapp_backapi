package jp.co.myapp.api.app.data.xml.haestimatexml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AppDataFormat")
public class HaEstimateXMLAppDataFormat {
	/**
	 * 保険始期(hokenShiki)
	 */
	private String hokenShiki;

	/**
	 * 保険終期(hokenShuki)
	 */
	private String hokenShuki;

	/**
	 * 地震保険始期(jishinHokenShiki)
	 */
	private String jishinHokenShiki;

	/**
	 * 地震保険終期(jishinHokenShuki)
	 */
	private String jishinHokenShuki;

	/**
	 * 払込方法(haraikomiHoho)
	 */
	private String haraikomiHoho;

	/**
	 * 集金方法(shukinHoho)
	 */
	private String shukinHoho;

	/**
	 * 初回徴収－回数(shokaiChoshu_Kaisu)
	 */
	private String shokaiChoshuKaisu;

	/**
	 * 年間分割払－回数(nenkanBunkatsubarai_Kaisu)
	 */
	private String nenkanBunkatsubaraiKaisu;

	/**
	 * 地震保険期間区分(jishinHokenKikan)
	 */
	private String jishinHokenKikan;

	/**
	 * 地震長期年払(jishinChokiNenBarai)
	 */
	private String jishinChokiNenBarai;

	/**
	 * 所在地(taishoShozaichi)
	 */
	private String taishoShozaichi;

	/**
	 * 構造級別(kozoKyubetsu)
	 */
	private String kozoKyubetsu;

	/**
	 * 激変緩和(gekihenKanwa)
	 */
	private String gekihenKanwa;

	/**
	 * 用法(yoho)
	 */
	private String yoho;

	/**
	 * 占有面積(sennyuMenseki)
	 */
	private String sennyuMenseki;

	/**
	 * 建築年(kenchikuYear)
	 */
	private String kenchikuYear;

	/**
	 * 建築月(kenchikuMonth)
	 */
	private String kenchikuMonth;

	/**
	 * 建築年月不明(kenchikuYMFumei)
	 */
	private String kenchikuYMFumei;

	/**
	 * 建物保険金額(tatemonoAmt)
	 */
	private String tatemonoAmt;

	/**
	 * 家財保険金額(kazaiAmt)
	 */
	private String kazaiAmt;

	/**
	 * 設備什器保険金額(setsubiJukiAmt)
	 */
	private String setsubiJukiAmt;

	/**
	 * 商品製品保険金額(shohinSeihinAmt)
	 */
	private String shohinSeihinAmt;

	/**
	 * 明記物件保険金額(meikibukkenAmt)
	 */
	private String meikibukkenAmt;

	/**
	 * 地震建物保険金額(jishinTatemonoAmt)
	 */
	private String jishinTatemonoAmt;

	/**
	 * 地震家財保険金額(jishinKazaiAmt)
	 */
	private String jishinKazaiAmt;

	/**
	 * 個人賠償支払限度額(kojinBaishoAmt)
	 */
	private String kojinBaishoAmt;

	/**
	 * 借家人賠償支払限度額(shakkaninBaishoAmt)
	 */
	private String shakkaninBaishoAmt;

	/**
	 * 類焼損害担保特約有無(ruishoSongai)
	 */
	private String ruishoSongai;

	/**
	 * 建物風雹雪免責金額(tatemonoFuhyosetsuMenseki)
	 */
	private String tatemonoFuhyosetsuMenseki;

	/**
	 * 家財風雹雪免責金額(kazaiFuhyosetsuMenseki)
	 */
	private String kazaiFuhyosetsuMenseki;

	/**
	 * 建物破汚損免責金額(tatemonoHaosonMenseki)
	 */
	private String tatemonoHaosonMenseki;

	/**
	 * 家財破汚損免責金額(kazaiHaosonMenseki)
	 */
	private String kazaiHaosonMenseki;

	/**
	 * 家財破汚損支払限度額(kazaiHaosonGendogaku)
	 */
	private String kazaiHaosonGendogaku;

	/**
	 * 職作業CD(shokuSagyoCD)
	 */
	private String shokuSagyoCD;

	/**
	 * 大口団体割増引率(oguchiDantaiWaribiki)
	 */
	private String oguchiDantaiWaribiki;

	/**
	 * 地震割引(jishinWaribiki)
	 */
	private String jishinWaribiki;

	/**
	 * 火災等のみ補償(kasaiKikenNomiHosho)
	 */
	private String kasaiKikenNomiHosho;

	/**
	 * 災害時諸費用対象外(saigaiShohiyoTaishogai)
	 */
	private String saigaiShohiyoTaishogai;

	/**
	 * 災害時諸費用支払限度額変更400万(saigaijiShohiyoGendoHenko4M)
	 */
	private String saigaijiShohiyoGendoHenko4M;

	/**
	 * 災害時諸費用支払限度額変更300万(saigaijiShohiyoGendoHenko3M)
	 */
	private String saigaijiShohiyoGendoHenko3M;

	/**
	 * 災害時諸費用支払限度額変更200万(saigaijiShohiyoGendoHenko2M)
	 */
	private String saigaijiShohiyoGendoHenko2M;

	/**
	 * 災害時諸費用支払限度額変更100万(saigaijiShohiyoGendoHenko1M)
	 */
	private String saigaijiShohiyoGendoHenko1M;

	/**
	 * 破汚損対象外(haosonTaishogai)
	 */
	private String haosonTaishogai;

	/**
	 * 雑危険対象外(zatsuKikenTaishogai)
	 */
	private String zatsuKikenTaishogai;

	/**
	 * 水災危険対象外(suisaiTaishogai)
	 */
	private String suisaiTaishogai;

	/**
	 * 構内構造物修理費用(konaiShurihiyo)
	 */
	private String konaiShurihiyo;

	/**
	 * 共用部分修理費用(kyoyoShurihiyo)
	 */
	private String kyoyoShurihiyo;

	/**
	 * 防犯対策費用(bohanTaisakuhiyo)
	 */
	private String bohanTaisakuhiyo;

	/**
	 * バリアフリー改造等費用(barrierFreeHiyo)
	 */
	private String barrierFreeHiyo;

	/**
	 * 建替費用(tatekaeHiyo)
	 */
	private String tatekaeHiyo;

	/**
	 * 持ち出し家財(mochidashiKazai)
	 */
	private String mochidashiKazai;

	/**
	 * 引越し中の損害補償特約(hikkoshiSongai)
	 */
	private String hikkoshiSongai;

	/**
	 * 風災支払等変更(fusaiSiharaiHenko)
	 */
	private String fusaiSiharaiHenko;

	/**
	 * 水災支払等変更(suisaiSiharaiHenko)
	 */
	private String suisaiSiharaiHenko;

	/**
	 * 水濡れ原因調査費用(mizunureGeninChosaHiyo)
	 */
	private String mizunureGeninChosaHiyo;

	/**
	 * 賃貸住宅建物に関する特約(chintaiJutakuTatemono)
	 */
	private String chintaiJutakuTatemono;

	/**
	 * 保険始期(hokenShiki)の取得
	 * 
	 * @return hokenShiki
	 */
	@XmlElement(name = "HokenShiki")
	public String getHokenShiki() {
		return hokenShiki;
	}

	/**
	 * 保険始期(hokenShiki)の設定
	 * 
	 * @param hokenShiki
	 *            String
	 */
	public void setHokenShiki(String hokenShiki) {
		this.hokenShiki = hokenShiki;
	}

	/**
	 * 保険終期(hokenShuki)の取得
	 * 
	 * @return hokenShuki
	 */
	@XmlElement(name = "HokenShuki")
	public String getHokenShuki() {
		return hokenShuki;
	}

	/**
	 * 保険終期(hokenShuki)の設定
	 * 
	 * @param hokenShuki
	 *            String
	 */
	public void setHokenShuki(String hokenShuki) {
		this.hokenShuki = hokenShuki;
	}

	/**
	 * 地震保険始期(jishinHokenShiki)の取得
	 * 
	 * @return jishinHokenShiki
	 */
	@XmlElement(name = "JishinHokenShiki")
	public String getJishinHokenShiki() {
		return jishinHokenShiki;
	}

	/**
	 * 地震保険始期(jishinHokenShiki)の設定
	 * 
	 * @param jishinHokenShiki
	 *            String
	 */
	public void setJishinHokenShiki(String jishinHokenShiki) {
		this.jishinHokenShiki = jishinHokenShiki;
	}

	/**
	 * 地震保険終期(jishinHokenShuki)の取得
	 * 
	 * @return jishinHokenShuki
	 */
	@XmlElement(name = "JishinHokenShuki")
	public String getJishinHokenShuki() {
		return jishinHokenShuki;
	}

	/**
	 * 地震保険終期(jishinHokenShuki)の設定
	 * 
	 * @param jishinHokenShuki
	 *            String
	 */
	public void setJishinHokenShuki(String jishinHokenShuki) {
		this.jishinHokenShuki = jishinHokenShuki;
	}

	/**
	 * 払込方法(haraikomiHoho)の取得
	 * 
	 * @return haraikomiHoho
	 */
	@XmlElement(name = "HaraikomiHoho")
	public String getHaraikomiHoho() {
		return haraikomiHoho;
	}

	/**
	 * 払込方法(haraikomiHoho)の設定
	 * 
	 * @param haraikomiHoho
	 *            String
	 */
	public void setHaraikomiHoho(String haraikomiHoho) {
		this.haraikomiHoho = haraikomiHoho;
	}

	/**
	 * 集金方法(shukinHoho)の取得
	 * 
	 * @return shukinHoho
	 */
	@XmlElement(name = "ShukinHoho")
	public String getShukinHoho() {
		return shukinHoho;
	}

	/**
	 * 集金方法(shukinHoho)の設定
	 * 
	 * @param shukinHoho
	 *            String
	 */
	public void setShukinHoho(String shukinHoho) {
		this.shukinHoho = shukinHoho;
	}

	/**
	 * 初回徴収－回数(shokaiChoshu_Kaisu)の取得
	 * 
	 * @return shokaiChoshuKaisu
	 */
	@XmlElement(name = "ShokaiChoshu_Kaisu")
	public String getShokaiChoshuKaisu() {
		return shokaiChoshuKaisu;
	}

	/**
	 * 初回徴収－回数(shokaiChoshu_Kaisu)の設定
	 * 
	 * @param shokaiChoshuKaisu
	 *            String
	 */
	public void setShokaiChoshuKaisu(String shokaiChoshuKaisu) {
		this.shokaiChoshuKaisu = shokaiChoshuKaisu;
	}

	/**
	 * 年間分割払－回数(nenkanBunkatsubarai_Kaisu)の取得
	 * 
	 * @return nenkanBunkatsubaraiKaisu
	 */
	@XmlElement(name = "NenkanBunkatsubarai_Kaisu")
	public String getNenkanBunkatsubaraiKaisu() {
		return nenkanBunkatsubaraiKaisu;
	}

	/**
	 * 年間分割払－回数(nenkanBunkatsubarai_Kaisu)の設定
	 * 
	 * @param nenkanBunkatsubaraiKaisu
	 *            String
	 */
	public void setNenkanBunkatsubaraiKaisu(String nenkanBunkatsubaraiKaisu) {
		this.nenkanBunkatsubaraiKaisu = nenkanBunkatsubaraiKaisu;
	}

	/**
	 * 地震保険期間区分(jishinHokenKikan)の取得
	 * 
	 * @return jishinHokenKikan
	 */
	@XmlElement(name = "JishinHokenKikan")
	public String getJishinHokenKikan() {
		return jishinHokenKikan;
	}

	/**
	 * 地震保険期間区分(jishinHokenKikan)の設定
	 * 
	 * @param jishinHokenKikan
	 *            String
	 */
	public void setJishinHokenKikan(String jishinHokenKikan) {
		this.jishinHokenKikan = jishinHokenKikan;
	}

	/**
	 * 地震長期年払(jishinChokiNenBarai)の取得
	 * 
	 * @return jishinChokiNenBarai
	 */
	@XmlElement(name = "JishinChokiNenBarai")
	public String getJishinChokiNenBarai() {
		return jishinChokiNenBarai;
	}

	/**
	 * 地震長期年払(jishinChokiNenBarai)の設定
	 * 
	 * @param jishinChokiNenBarai
	 *            String
	 */
	public void setJishinChokiNenBarai(String jishinChokiNenBarai) {
		this.jishinChokiNenBarai = jishinChokiNenBarai;
	}

	/**
	 * 所在地(taishoShozaichi)の取得
	 * 
	 * @return taishoShozaichi
	 */
	@XmlElement(name = "TaishoShozaichi")
	public String getTaishoShozaichi() {
		return taishoShozaichi;
	}

	/**
	 * 所在地(taishoShozaichi)の設定
	 * 
	 * @param taishoShozaichi
	 *            String
	 */
	public void setTaishoShozaichi(String taishoShozaichi) {
		this.taishoShozaichi = taishoShozaichi;
	}

	/**
	 * 構造級別(kozoKyubetsu)の取得
	 * 
	 * @return kozoKyubetsu
	 */
	@XmlElement(name = "KozoKyubetsu")
	public String getKozoKyubetsu() {
		return kozoKyubetsu;
	}

	/**
	 * 構造級別(kozoKyubetsu)の設定
	 * 
	 * @param kozoKyubetsu
	 *            String
	 */
	public void setKozoKyubetsu(String kozoKyubetsu) {
		this.kozoKyubetsu = kozoKyubetsu;
	}

	/**
	 * 激変緩和(gekihenKanwa)の取得
	 * 
	 * @return gekihenKanwa
	 */
	@XmlElement(name = "GekihenKanwa")
	public String getGekihenKanwa() {
		return gekihenKanwa;
	}

	/**
	 * 激変緩和(gekihenKanwa)の設定
	 * 
	 * @param gekihenKanwa
	 *            String
	 */
	public void setGekihenKanwa(String gekihenKanwa) {
		this.gekihenKanwa = gekihenKanwa;
	}

	/**
	 * 用法(yoho)の取得
	 * 
	 * @return yoho
	 */
	@XmlElement(name = "Yoho")
	public String getYoho() {
		return yoho;
	}

	/**
	 * 用法(yoho)の設定
	 * 
	 * @param yoho
	 *            String
	 */
	public void setYoho(String yoho) {
		this.yoho = yoho;
	}

	/**
	 * 占有面積(sennyuMenseki)の取得
	 * 
	 * @return sennyuMenseki
	 */
	@XmlElement(name = "SennyuMenseki")
	public String getSennyuMenseki() {
		return sennyuMenseki;
	}

	/**
	 * 占有面積(sennyuMenseki)の設定
	 * 
	 * @param sennyuMenseki
	 *            String
	 */
	public void setSennyuMenseki(String sennyuMenseki) {
		this.sennyuMenseki = sennyuMenseki;
	}

	/**
	 * 建築年(kenchikuYear)の取得
	 * 
	 * @return kenchikuYear
	 */
	@XmlElement(name = "KenchikuYear")
	public String getKenchikuYear() {
		return kenchikuYear;
	}

	/**
	 * 建築年(kenchikuYear)の設定
	 * 
	 * @param kenchikuYear
	 *            String
	 */
	public void setKenchikuYear(String kenchikuYear) {
		this.kenchikuYear = kenchikuYear;
	}

	/**
	 * 建築月(kenchikuMonth)の取得
	 * 
	 * @return kenchikuMonth
	 */
	@XmlElement(name = "KenchikuMonth")
	public String getKenchikuMonth() {
		return kenchikuMonth;
	}

	/**
	 * 建築月(kenchikuMonth)の設定
	 * 
	 * @param kenchikuMonth
	 *            String
	 */
	public void setKenchikuMonth(String kenchikuMonth) {
		this.kenchikuMonth = kenchikuMonth;
	}

	/**
	 * 建築年月不明(kenchikuYMFumei)の取得
	 * 
	 * @return kenchikuYMFumei
	 */
	@XmlElement(name = "KenchikuYMFumei")
	public String getKenchikuYMFumei() {
		return kenchikuYMFumei;
	}

	/**
	 * 建築年月不明(kenchikuYMFumei)の設定
	 * 
	 * @param kenchikuYMFumei
	 *            String
	 */
	public void setKenchikuYMFumei(String kenchikuYMFumei) {
		this.kenchikuYMFumei = kenchikuYMFumei;
	}

	/**
	 * 建物保険金額(tatemonoAmt)の取得
	 * 
	 * @return tatemonoAmt
	 */
	@XmlElement(name = "TatemonoAmt")
	public String getTatemonoAmt() {
		return tatemonoAmt;
	}

	/**
	 * 建物保険金額(tatemonoAmt)の設定
	 * 
	 * @param tatemonoAmt
	 *            String
	 */
	public void setTatemonoAmt(String tatemonoAmt) {
		this.tatemonoAmt = tatemonoAmt;
	}

	/**
	 * 家財保険金額(kazaiAmt)の取得
	 * 
	 * @return kazaiAmt
	 */
	@XmlElement(name = "KazaiAmt")
	public String getKazaiAmt() {
		return kazaiAmt;
	}

	/**
	 * 家財保険金額(kazaiAmt)の設定
	 * 
	 * @param kazaiAmt
	 *            String
	 */
	public void setKazaiAmt(String kazaiAmt) {
		this.kazaiAmt = kazaiAmt;
	}

	/**
	 * 設備什器保険金額(setsubiJukiAmt)の取得
	 * 
	 * @return setsubiJukiAmt
	 */
	@XmlElement(name = "SetsubiJukiAmt")
	public String getSetsubiJukiAmt() {
		return setsubiJukiAmt;
	}

	/**
	 * 設備什器保険金額(setsubiJukiAmt)の設定
	 * 
	 * @param setsubiJukiAmt
	 *            String
	 */
	public void setSetsubiJukiAmt(String setsubiJukiAmt) {
		this.setsubiJukiAmt = setsubiJukiAmt;
	}

	/**
	 * 商品製品保険金額(shohinSeihinAmt)の取得
	 * 
	 * @return shohinSeihinAmt
	 */
	@XmlElement(name = "ShohinSeihinAmt")
	public String getShohinSeihinAmt() {
		return shohinSeihinAmt;
	}

	/**
	 * 商品製品保険金額(shohinSeihinAmt)の設定
	 * 
	 * @param shohinSeihinAmt
	 *            String
	 */
	public void setShohinSeihinAmt(String shohinSeihinAmt) {
		this.shohinSeihinAmt = shohinSeihinAmt;
	}

	/**
	 * 明記物件保険金額(meikibukkenAmt)の取得
	 * 
	 * @return meikibukkenAmt
	 */
	@XmlElement(name = "MeikibukkenAmt")
	public String getMeikibukkenAmt() {
		return meikibukkenAmt;
	}

	/**
	 * 明記物件保険金額(meikibukkenAmt)の設定
	 * 
	 * @param meikibukkenAmt
	 *            String
	 */
	public void setMeikibukkenAmt(String meikibukkenAmt) {
		this.meikibukkenAmt = meikibukkenAmt;
	}

	/**
	 * 地震建物保険金額(jishinTatemonoAmt)の取得
	 * 
	 * @return jishinTatemonoAmt
	 */
	@XmlElement(name = "JishinTatemonoAmt")
	public String getJishinTatemonoAmt() {
		return jishinTatemonoAmt;
	}

	/**
	 * 地震建物保険金額(jishinTatemonoAmt)の設定
	 * 
	 * @param jishinTatemonoAmt
	 *            String
	 */
	public void setJishinTatemonoAmt(String jishinTatemonoAmt) {
		this.jishinTatemonoAmt = jishinTatemonoAmt;
	}

	/**
	 * 地震家財保険金額(jishinKazaiAmt)の取得
	 * 
	 * @return jishinKazaiAmt
	 */
	@XmlElement(name = "JishinKazaiAmt")
	public String getJishinKazaiAmt() {
		return jishinKazaiAmt;
	}

	/**
	 * 地震家財保険金額(jishinKazaiAmt)の設定
	 * 
	 * @param jishinKazaiAmt
	 *            String
	 */
	public void setJishinKazaiAmt(String jishinKazaiAmt) {
		this.jishinKazaiAmt = jishinKazaiAmt;
	}

	/**
	 * 個人賠償支払限度額(kojinBaishoAmt)の取得
	 * 
	 * @return kojinBaishoAmt
	 */
	@XmlElement(name = "KojinBaishoAmt")
	public String getKojinBaishoAmt() {
		return kojinBaishoAmt;
	}

	/**
	 * 個人賠償支払限度額(kojinBaishoAmt)の設定
	 * 
	 * @param kojinBaishoAmt
	 *            String
	 */
	public void setKojinBaishoAmt(String kojinBaishoAmt) {
		this.kojinBaishoAmt = kojinBaishoAmt;
	}

	/**
	 * 借家人賠償支払限度額(shakkaninBaishoAmt)の取得
	 * 
	 * @return shakkaninBaishoAmt
	 */
	@XmlElement(name = "ShakkaninBaishoAmt")
	public String getShakkaninBaishoAmt() {
		return shakkaninBaishoAmt;
	}

	/**
	 * 借家人賠償支払限度額(shakkaninBaishoAmt)の設定
	 * 
	 * @param shakkaninBaishoAmt
	 *            String
	 */
	public void setShakkaninBaishoAmt(String shakkaninBaishoAmt) {
		this.shakkaninBaishoAmt = shakkaninBaishoAmt;
	}

	/**
	 * 類焼損害担保特約有無(ruishoSongai)の取得
	 * 
	 * @return ruishoSongai
	 */
	@XmlElement(name = "RuishoSongai")
	public String getRuishoSongai() {
		return ruishoSongai;
	}

	/**
	 * 類焼損害担保特約有無(ruishoSongai)の設定
	 * 
	 * @param ruishoSongai
	 *            String
	 */
	public void setRuishoSongai(String ruishoSongai) {
		this.ruishoSongai = ruishoSongai;
	}

	/**
	 * 建物風雹雪免責金額(tatemonoFuhyosetsuMenseki)の取得
	 * 
	 * @return tatemonoFuhyosetsuMenseki
	 */
	@XmlElement(name = "TatemonoFuhyosetsuMenseki")
	public String getTatemonoFuhyosetsuMenseki() {
		return tatemonoFuhyosetsuMenseki;
	}

	/**
	 * 建物風雹雪免責金額(tatemonoFuhyosetsuMenseki)の設定
	 * 
	 * @param tatemonoFuhyosetsuMenseki
	 *            String
	 */
	public void setTatemonoFuhyosetsuMenseki(String tatemonoFuhyosetsuMenseki) {
		this.tatemonoFuhyosetsuMenseki = tatemonoFuhyosetsuMenseki;
	}

	/**
	 * 家財風雹雪免責金額(kazaiFuhyosetsuMenseki)の取得
	 * 
	 * @return kazaiFuhyosetsuMenseki
	 */
	@XmlElement(name = "KazaiFuhyosetsuMenseki")
	public String getKazaiFuhyosetsuMenseki() {
		return kazaiFuhyosetsuMenseki;
	}

	/**
	 * 家財風雹雪免責金額(kazaiFuhyosetsuMenseki)の設定
	 * 
	 * @param kazaiFuhyosetsuMenseki
	 *            String
	 */
	public void setKazaiFuhyosetsuMenseki(String kazaiFuhyosetsuMenseki) {
		this.kazaiFuhyosetsuMenseki = kazaiFuhyosetsuMenseki;
	}

	/**
	 * 建物破汚損免責金額(tatemonoHaosonMenseki)の取得
	 * 
	 * @return tatemonoHaosonMenseki
	 */
	@XmlElement(name = "TatemonoHaosonMenseki")
	public String getTatemonoHaosonMenseki() {
		return tatemonoHaosonMenseki;
	}

	/**
	 * 建物破汚損免責金額(tatemonoHaosonMenseki)の設定
	 * 
	 * @param tatemonoHaosonMenseki
	 *            String
	 */
	public void setTatemonoHaosonMenseki(String tatemonoHaosonMenseki) {
		this.tatemonoHaosonMenseki = tatemonoHaosonMenseki;
	}

	/**
	 * 家財破汚損免責金額(kazaiHaosonMenseki)の取得
	 * 
	 * @return kazaiHaosonMenseki
	 */
	@XmlElement(name = "KazaiHaosonMenseki")
	public String getKazaiHaosonMenseki() {
		return kazaiHaosonMenseki;
	}

	/**
	 * 家財破汚損免責金額(kazaiHaosonMenseki)の設定
	 * 
	 * @param kazaiHaosonMenseki
	 *            String
	 */
	public void setKazaiHaosonMenseki(String kazaiHaosonMenseki) {
		this.kazaiHaosonMenseki = kazaiHaosonMenseki;
	}

	/**
	 * 家財破汚損支払限度額(kazaiHaosonGendogaku)の取得
	 * 
	 * @return kazaiHaosonGendogaku
	 */
	@XmlElement(name = "KazaiHaosonGendogaku")
	public String getKazaiHaosonGendogaku() {
		return kazaiHaosonGendogaku;
	}

	/**
	 * 家財破汚損支払限度額(kazaiHaosonGendogaku)の設定
	 * 
	 * @param kazaiHaosonGendogaku
	 *            String
	 */
	public void setKazaiHaosonGendogaku(String kazaiHaosonGendogaku) {
		this.kazaiHaosonGendogaku = kazaiHaosonGendogaku;
	}

	/**
	 * 職作業CD(shokuSagyoCD)の取得
	 * 
	 * @return shokuSagyoCD
	 */
	@XmlElement(name = "ShokuSagyoCD")
	public String getShokuSagyoCD() {
		return shokuSagyoCD;
	}

	/**
	 * 職作業CD(shokuSagyoCD)の設定
	 * 
	 * @param shokuSagyoCD
	 *            String
	 */
	public void setShokuSagyoCD(String shokuSagyoCD) {
		this.shokuSagyoCD = shokuSagyoCD;
	}

	/**
	 * 大口団体割増引率(oguchiDantaiWaribiki)の取得
	 * 
	 * @return oguchiDantaiWaribiki
	 */
	@XmlElement(name = "OguchiDantaiWaribiki")
	public String getOguchiDantaiWaribiki() {
		return oguchiDantaiWaribiki;
	}

	/**
	 * 大口団体割増引率(oguchiDantaiWaribiki)の設定
	 * 
	 * @param oguchiDantaiWaribiki
	 *            String
	 */
	public void setOguchiDantaiWaribiki(String oguchiDantaiWaribiki) {
		this.oguchiDantaiWaribiki = oguchiDantaiWaribiki;
	}

	/**
	 * 地震割引(jishinWaribiki)の取得
	 * 
	 * @return jishinWaribiki
	 */
	@XmlElement(name = "JishinWaribiki")
	public String getJishinWaribiki() {
		return jishinWaribiki;
	}

	/**
	 * 地震割引(jishinWaribiki)の設定
	 * 
	 * @param jishinWaribiki
	 *            String
	 */
	public void setJishinWaribiki(String jishinWaribiki) {
		this.jishinWaribiki = jishinWaribiki;
	}

	/**
	 * 火災等のみ補償(kasaiKikenNomiHosho)の取得
	 * 
	 * @return kasaiKikenNomiHosho
	 */
	@XmlElement(name = "KasaiKikenNomiHosho")
	public String getKasaiKikenNomiHosho() {
		return kasaiKikenNomiHosho;
	}

	/**
	 * 火災等のみ補償(kasaiKikenNomiHosho)の設定
	 * 
	 * @param kasaiKikenNomiHosho
	 *            String
	 */
	public void setKasaiKikenNomiHosho(String kasaiKikenNomiHosho) {
		this.kasaiKikenNomiHosho = kasaiKikenNomiHosho;
	}

	/**
	 * 災害時諸費用対象外(saigaiShohiyoTaishogai)の取得
	 * 
	 * @return saigaiShohiyoTaishogai
	 */
	@XmlElement(name = "SaigaiShohiyoTaishogai")
	public String getSaigaiShohiyoTaishogai() {
		return saigaiShohiyoTaishogai;
	}

	/**
	 * 災害時諸費用対象外(saigaiShohiyoTaishogai)の設定
	 * 
	 * @param saigaiShohiyoTaishogai
	 *            String
	 */
	public void setSaigaiShohiyoTaishogai(String saigaiShohiyoTaishogai) {
		this.saigaiShohiyoTaishogai = saigaiShohiyoTaishogai;
	}

	/**
	 * 災害時諸費用支払限度額変更400万(saigaijiShohiyoGendoHenko4M)の取得
	 * 
	 * @return saigaijiShohiyoGendoHenko4M
	 */
	@XmlElement(name = "SaigaijiShohiyoGendoHenko4M")
	public String getSaigaijiShohiyoGendoHenko4M() {
		return saigaijiShohiyoGendoHenko4M;
	}

	/**
	 * 災害時諸費用支払限度額変更400万(saigaijiShohiyoGendoHenko4M)の設定
	 * 
	 * @param saigaijiShohiyoGendoHenko4M
	 *            String
	 */
	public void setSaigaijiShohiyoGendoHenko4M(String saigaijiShohiyoGendoHenko4M) {
		this.saigaijiShohiyoGendoHenko4M = saigaijiShohiyoGendoHenko4M;
	}

	/**
	 * 災害時諸費用支払限度額変更300万(saigaijiShohiyoGendoHenko3M)の取得
	 * 
	 * @return saigaijiShohiyoGendoHenko3M
	 */
	@XmlElement(name = "SaigaijiShohiyoGendoHenko3M")
	public String getSaigaijiShohiyoGendoHenko3M() {
		return saigaijiShohiyoGendoHenko3M;
	}

	/**
	 * 災害時諸費用支払限度額変更300万(saigaijiShohiyoGendoHenko3M)の設定
	 * 
	 * @param saigaijiShohiyoGendoHenko3M
	 *            String
	 */
	public void setSaigaijiShohiyoGendoHenko3M(String saigaijiShohiyoGendoHenko3M) {
		this.saigaijiShohiyoGendoHenko3M = saigaijiShohiyoGendoHenko3M;
	}

	/**
	 * 災害時諸費用支払限度額変更200万(saigaijiShohiyoGendoHenko2M)の取得
	 * 
	 * @return saigaijiShohiyoGendoHenko2M
	 */
	@XmlElement(name = "SaigaijiShohiyoGendoHenko2M")
	public String getSaigaijiShohiyoGendoHenko2M() {
		return saigaijiShohiyoGendoHenko2M;
	}

	/**
	 * 災害時諸費用支払限度額変更200万(saigaijiShohiyoGendoHenko2M)の設定
	 * 
	 * @param saigaijiShohiyoGendoHenko2M
	 *            String
	 */
	public void setSaigaijiShohiyoGendoHenko2M(String saigaijiShohiyoGendoHenko2M) {
		this.saigaijiShohiyoGendoHenko2M = saigaijiShohiyoGendoHenko2M;
	}

	/**
	 * 災害時諸費用支払限度額変更100万(saigaijiShohiyoGendoHenko1M)の取得
	 * 
	 * @return saigaijiShohiyoGendoHenko1M
	 */
	@XmlElement(name = "SaigaijiShohiyoGendoHenko1M")
	public String getSaigaijiShohiyoGendoHenko1M() {
		return saigaijiShohiyoGendoHenko1M;
	}

	/**
	 * 災害時諸費用支払限度額変更100万(saigaijiShohiyoGendoHenko1M)の設定
	 * 
	 * @param saigaijiShohiyoGendoHenko1M
	 *            String
	 */
	public void setSaigaijiShohiyoGendoHenko1M(String saigaijiShohiyoGendoHenko1M) {
		this.saigaijiShohiyoGendoHenko1M = saigaijiShohiyoGendoHenko1M;
	}

	/**
	 * 破汚損対象外(haosonTaishogai)の取得
	 * 
	 * @return haosonTaishogai
	 */
	@XmlElement(name = "HaosonTaishogai")
	public String getHaosonTaishogai() {
		return haosonTaishogai;
	}

	/**
	 * 破汚損対象外(haosonTaishogai)の設定
	 * 
	 * @param haosonTaishogai
	 *            String
	 */
	public void setHaosonTaishogai(String haosonTaishogai) {
		this.haosonTaishogai = haosonTaishogai;
	}

	/**
	 * 雑危険対象外(zatsuKikenTaishogai)の取得
	 * 
	 * @return zatsuKikenTaishogai
	 */
	@XmlElement(name = "ZatsuKikenTaishogai")
	public String getZatsuKikenTaishogai() {
		return zatsuKikenTaishogai;
	}

	/**
	 * 雑危険対象外(zatsuKikenTaishogai)の設定
	 * 
	 * @param zatsuKikenTaishogai
	 *            String
	 */
	public void setZatsuKikenTaishogai(String zatsuKikenTaishogai) {
		this.zatsuKikenTaishogai = zatsuKikenTaishogai;
	}

	/**
	 * 水災危険対象外(suisaiTaishogai)の取得
	 * 
	 * @return suisaiTaishogai
	 */
	@XmlElement(name = "SuisaiTaishogai")
	public String getSuisaiTaishogai() {
		return suisaiTaishogai;
	}

	/**
	 * 水災危険対象外(suisaiTaishogai)の設定
	 * 
	 * @param suisaiTaishogai
	 *            String
	 */
	public void setSuisaiTaishogai(String suisaiTaishogai) {
		this.suisaiTaishogai = suisaiTaishogai;
	}

	/**
	 * 構内構造物修理費用(konaiShurihiyo)の取得
	 * 
	 * @return konaiShurihiyo
	 */
	@XmlElement(name = "KonaiShurihiyo")
	public String getKonaiShurihiyo() {
		return konaiShurihiyo;
	}

	/**
	 * 構内構造物修理費用(konaiShurihiyo)の設定
	 * 
	 * @param konaiShurihiyo
	 *            String
	 */
	public void setKonaiShurihiyo(String konaiShurihiyo) {
		this.konaiShurihiyo = konaiShurihiyo;
	}

	/**
	 * 共用部分修理費用(kyoyoShurihiyo)の取得
	 * 
	 * @return kyoyoShurihiyo
	 */
	@XmlElement(name = "KyoyoShurihiyo")
	public String getKyoyoShurihiyo() {
		return kyoyoShurihiyo;
	}

	/**
	 * 共用部分修理費用(kyoyoShurihiyo)の設定
	 * 
	 * @param kyoyoShurihiyo
	 *            String
	 */
	public void setKyoyoShurihiyo(String kyoyoShurihiyo) {
		this.kyoyoShurihiyo = kyoyoShurihiyo;
	}

	/**
	 * 防犯対策費用(bohanTaisakuhiyo)の取得
	 * 
	 * @return bohanTaisakuhiyo
	 */
	@XmlElement(name = "BohanTaisakuhiyo")
	public String getBohanTaisakuhiyo() {
		return bohanTaisakuhiyo;
	}

	/**
	 * 防犯対策費用(bohanTaisakuhiyo)の設定
	 * 
	 * @param bohanTaisakuhiyo
	 *            String
	 */
	public void setBohanTaisakuhiyo(String bohanTaisakuhiyo) {
		this.bohanTaisakuhiyo = bohanTaisakuhiyo;
	}

	/**
	 * バリアフリー改造等費用(barrierFreeHiyo)の取得
	 * 
	 * @return barrierFreeHiyo
	 */
	@XmlElement(name = "BarrierFreeHiyo")
	public String getBarrierFreeHiyo() {
		return barrierFreeHiyo;
	}

	/**
	 * バリアフリー改造等費用(barrierFreeHiyo)の設定
	 * 
	 * @param barrierFreeHiyo
	 *            String
	 */
	public void setBarrierFreeHiyo(String barrierFreeHiyo) {
		this.barrierFreeHiyo = barrierFreeHiyo;
	}

	/**
	 * 建替費用(tatekaeHiyo)の取得
	 * 
	 * @return tatekaeHiyo
	 */
	@XmlElement(name = "TatekaeHiyo")
	public String getTatekaeHiyo() {
		return tatekaeHiyo;
	}

	/**
	 * 建替費用(tatekaeHiyo)の設定
	 * 
	 * @param tatekaeHiyo
	 *            String
	 */
	public void setTatekaeHiyo(String tatekaeHiyo) {
		this.tatekaeHiyo = tatekaeHiyo;
	}

	/**
	 * 持ち出し家財(mochidashiKazai)の取得
	 * 
	 * @return mochidashiKazai
	 */
	@XmlElement(name = "MochidashiKazai")
	public String getMochidashiKazai() {
		return mochidashiKazai;
	}

	/**
	 * 持ち出し家財(mochidashiKazai)の設定
	 * 
	 * @param mochidashiKazai
	 *            String
	 */
	public void setMochidashiKazai(String mochidashiKazai) {
		this.mochidashiKazai = mochidashiKazai;
	}

	/**
	 * 引越し中の損害補償特約(hikkoshiSongai)の取得
	 * 
	 * @return hikkoshiSongai
	 */
	@XmlElement(name = "HikkoshiSongai")
	public String getHikkoshiSongai() {
		return hikkoshiSongai;
	}

	/**
	 * 引越し中の損害補償特約(hikkoshiSongai)の設定
	 * 
	 * @param hikkoshiSongai
	 *            String
	 */
	public void setHikkoshiSongai(String hikkoshiSongai) {
		this.hikkoshiSongai = hikkoshiSongai;
	}

	/**
	 * 風災支払等変更(fusaiSiharaiHenko)の取得
	 * 
	 * @return fusaiSiharaiHenko
	 */
	@XmlElement(name = "FusaiSiharaiHenko")
	public String getFusaiSiharaiHenko() {
		return fusaiSiharaiHenko;
	}

	/**
	 * 風災支払等変更(fusaiSiharaiHenko)の設定
	 * 
	 * @param fusaiSiharaiHenko
	 *            String
	 */
	public void setFusaiSiharaiHenko(String fusaiSiharaiHenko) {
		this.fusaiSiharaiHenko = fusaiSiharaiHenko;
	}

	/**
	 * 水災支払等変更(suisaiSiharaiHenko)の取得
	 * 
	 * @return suisaiSiharaiHenko
	 */
	@XmlElement(name = "SuisaiSiharaiHenko")
	public String getSuisaiSiharaiHenko() {
		return suisaiSiharaiHenko;
	}

	/**
	 * 水災支払等変更(suisaiSiharaiHenko)の設定
	 * 
	 * @param suisaiSiharaiHenko
	 *            String
	 */
	public void setSuisaiSiharaiHenko(String suisaiSiharaiHenko) {
		this.suisaiSiharaiHenko = suisaiSiharaiHenko;
	}

	/**
	 * 水濡れ原因調査費用(mizunureGeninChosaHiyo)の取得
	 * 
	 * @return mizunureGeninChosaHiyo
	 */
	@XmlElement(name = "MizunureGeninChosaHiyo")
	public String getMizunureGeninChosaHiyo() {
		return mizunureGeninChosaHiyo;
	}

	/**
	 * 水濡れ原因調査費用(mizunureGeninChosaHiyo)の設定
	 * 
	 * @param mizunureGeninChosaHiyo
	 *            String
	 */
	public void setMizunureGeninChosaHiyo(String mizunureGeninChosaHiyo) {
		this.mizunureGeninChosaHiyo = mizunureGeninChosaHiyo;
	}

	/**
	 * 賃貸住宅建物に関する特約(chintaiJutakuTatemono)の取得
	 * 
	 * @return chintaiJutakuTatemono
	 */
	@XmlElement(name = "ChintaiJutakuTatemono")
	public String getChintaiJutakuTatemono() {
		return chintaiJutakuTatemono;
	}

	/**
	 * 賃貸住宅建物に関する特約(chintaiJutakuTatemono)の設定
	 * 
	 * @param chintaiJutakuTatemono
	 *            String
	 */
	public void setChintaiJutakuTatemono(String chintaiJutakuTatemono) {
		this.chintaiJutakuTatemono = chintaiJutakuTatemono;
	}

}
