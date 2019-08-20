package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class AcceptLimitRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 画面ID
	 */
	private String screenId;

	/** 引受制限項目 */
	/**
	 * 明記物件の保険金額
	 */
	private int meikihokengaku;

	/**
	 * おすすめプラン火災等危険のみ補償特約
	 */

	private String oTokuKasaiNomi;

	/**
	 * フリープラン火災等危険のみ補償特約
	 */
	private String fTokuKasaiNomi;

	/**
	 * おすすめプラン借家人賠償責任補償特約支払限度額
	 */
	private int oTokuShakuyabaishoLimit;

	/**
	 * フリープラン借家人賠償責任補償特約支払限度額
	 */
	private int fTokuShakuyabaishfLimit;

	/**
	 * おすすめプラン建物管理賠償責任補償特約支払限度額
	 */
	private int oTokuTatebaishoLimit;

	/**
	 * フリープラン建物管理賠償責任補償特約支払限度額
	 */
	private int fTokuTatebaishfLimit;

	/**
	 * 建物形態
	 */
	private String tateKeitai;

	/**
	 * 保険始期日
	 */
	private String shikiDate;

	/**
	 * 建物建築年月
	 */
	private String kenchikuVmSeireki;

	/**
	 * 住宅ローン利用有無
	 */
	private String loanUmu;

	/**
	 * 築年数
	 */
	private int buildingStartMinusBuildingDate;

	/**
	 * 建築月
	 */
	private int buildingDateMonth;

	/**
	 * 建築年
	 */
	private int buildingDateYear;

	/**
	 * 開始月
	 */
	private int startDateMonth;

	/**
	 * 開始年
	 */
	private int startDateYear;

	/**
	 * 火災保険期間
	 */
	private int kasaiHkikan;

	/**
	 * 建物所在地
	 */
	private String shozai;

	/**
	 * 建物火災保険加入有無
	 */
	private String tateKanyu;

	/**
	 * 画面IDの取得
	 *
	 * @return pageId
	 */
	public String getScreenId() {
		return screenId;
	}

	/**
	 * @param pageId
	 */
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	/**
	 * hokengakuを取得する
	 *
	 * @return hokengaku
	 */
	public int getMeikihokengaku() {
		return meikihokengaku;
	}

	/**
	 * hokengakuを設定する
	 *
	 * @param hokengaku
	 */
	public void setMeikihokengaku(int hokengaku) {
		this.meikihokengaku = hokengaku;
	}

	/**
	 * oTokuKasaiNomiを取得する
	 *
	 * @return oTokuKasaiNomi
	 */
	public String getoTokuKasaiNomi() {
		return oTokuKasaiNomi;
	}

	/**
	 * oTokuKasaiNomiを設定する
	 *
	 * @param oTokuKasaiNomi
	 */
	public void setoTokuKasaiNomi(String oTokuKasaiNomi) {
		this.oTokuKasaiNomi = oTokuKasaiNomi;
	}

	/**
	 * fTokuKasaiNomiを取得する
	 *
	 * @return fTokuKasaiNomi
	 */
	public String getfTokuKasaiNomi() {
		return fTokuKasaiNomi;
	}

	/**
	 * fTokuKasaiNomiを設定する
	 *
	 * @param fTokuKasaiNomi
	 */
	public void setfTokuKasaiNomi(String fTokuKasaiNomi) {
		this.fTokuKasaiNomi = fTokuKasaiNomi;
	}

	/**
	 * oTokuShakuyabaishoLimitを取得する
	 *
	 * @return oTokuShakuyabaishoLimit
	 */
	public int getoTokuShakuyabaishoLimit() {
		return oTokuShakuyabaishoLimit;
	}

	/**
	 * oTokuShakuyabaishoLimitを設定する
	 *
	 * @param oTokuShakuyabaishoLimit
	 */
	public void setoTokuShakuyabaishoLimit(int oTokuShakuyabaishoLimit) {
		this.oTokuShakuyabaishoLimit = oTokuShakuyabaishoLimit;
	}

	/**
	 * fTokuShakuyabaishfLimitを取得する
	 *
	 * @return fTokuShakuyabaishfLimit
	 */
	public int getfTokuShakuyabaishfLimit() {
		return fTokuShakuyabaishfLimit;
	}

	/**
	 * fTokuShakuyabaishfLimitを設定する
	 *
	 * @param fTokuShakuyabaishfLimit
	 */
	public void setfTokuShakuyabaishfLimit(int fTokuShakuyabaishfLimit) {
		this.fTokuShakuyabaishfLimit = fTokuShakuyabaishfLimit;
	}

	/**
	 * oTokuTatebaishoLimitを取得する
	 *
	 * @return oTokuTatebaishoLimit
	 */
	public int getoTokuTatebaishoLimit() {
		return oTokuTatebaishoLimit;
	}

	/**
	 * oTokuTatebaishoLimitを設定する
	 *
	 * @param oTokuTatebaishoLimit
	 */
	public void setoTokuTatebaishoLimit(int oTokuTatebaishoLimit) {
		this.oTokuTatebaishoLimit = oTokuTatebaishoLimit;
	}

	/**
	 * fTokuTatebaishfLimitを取得する
	 *
	 * @return fTokuTatebaishfLimit
	 */
	public int getfTokuTatebaishfLimit() {
		return fTokuTatebaishfLimit;
	}

	/**
	 * fTokuTatebaishfLimitを設定する
	 *
	 * @param fTokuTatebaishfLimit
	 */
	public void setfTokuTatebaishfLimit(int fTokuTatebaishfLimit) {
		this.fTokuTatebaishfLimit = fTokuTatebaishfLimit;
	}

	/**
	 * tateKeitaiを取得する
	 *
	 * @return tateKeitai
	 */
	public String getTateKeitai() {
		return tateKeitai;
	}

	/**
	 * tateKeitaiを設定する
	 *
	 * @param tateKeitai tateKeitai
	 */
	public void setTateKeitai(String tateKeitai) {
		this.tateKeitai = tateKeitai;
	}

	/**
	 * shikiDateを取得する
	 *
	 * @return shikiDate
	 */
	public String getShikiDate() {
		return shikiDate;
	}

	/**
	 * shikiDateを設定する
	 *
	 * @param shikiDate shikiDate
	 */
	public void setShikiDate(String shikiDate) {
		this.shikiDate = shikiDate;
	}

	/**
	 * kenchikuVmSeirekiを取得する
	 *
	 * @return kenchikuVmSeireki
	 */
	public String getKenchikuVmSeireki() {
		return kenchikuVmSeireki;
	}

	/**
	 * kenchikuVmSeirekiを設定する
	 *
	 * @param kenchikuVmSeireki
	 */
	public void setKenchikuVmSeireki(String kenchikuVmSeireki) {
		this.kenchikuVmSeireki = kenchikuVmSeireki;
	}

	/**
	 * loanUmuを取得する
	 *
	 * @return loanUmu
	 */
	public String getLoanUmu() {
		return loanUmu;
	}

	/**
	 * loanUmuを設定する
	 *
	 * @param loanUmu loanUmu
	 */
	public void setLoanUmu(String loanUmu) {
		this.loanUmu = loanUmu;
	}

	/**
	 * buildingDateMonthを取得する
	 *
	 * @return buildingDateMonth
	 */
	public int getBuildingDateMonth() {
		return buildingDateMonth;
	}

	/**
	 * buildingDateMonthを設定する
	 *
	 * @param buildingDateMonth
	 */
	public void setBuildingDateMonth(int buildingDateMonth) {
		this.buildingDateMonth = buildingDateMonth;
	}

	/**
	 * buildingDateYearを取得する
	 *
	 * @return buildingDateYear
	 */
	public int getBuildingDateYear() {
		return buildingDateYear;
	}

	/**
	 * buildingDateYearを設定する
	 *
	 * @param buildingDateYear
	 */
	public void setBuildingDateYear(int buildingDateYear) {
		this.buildingDateYear = buildingDateYear;
	}

	/**
	 * startDateMonthを取得する
	 *
	 * @return startDateMonth
	 */
	public int getStartDateMonth() {
		return startDateMonth;
	}

	/**
	 * startDateMonthを設定する
	 *
	 * @param startDateMonth
	 */
	public void setStartDateMonth(int startDateMonth) {
		this.startDateMonth = startDateMonth;
	}

	/**
	 * startDateYearを取得する
	 *
	 * @return startDateYear
	 */
	public int getStartDateYear() {
		return startDateYear;
	}

	/**
	 * startDateYearを設定する
	 *
	 * @param startDateYear
	 */
	public void setStartDateYear(int startDateYear) {
		this.startDateYear = startDateYear;
	}

	/**
	 * kasaiHkikanを取得する
	 *
	 * @return kasaiHkikan
	 */
	public int getKasaiHkikan() {
		return kasaiHkikan;
	}

	/**
	 * kasaiHkikanを設定する
	 *
	 * @param kasaiHkikan
	 */
	public void setKasaiHkikan(int kasaiHkikan) {
		this.kasaiHkikan = kasaiHkikan;
	}

	/**
	 * shozaiを取得する
	 *
	 * @return shozai
	 */
	public String getShozai() {
		return shozai;
	}

	/**
	 * shozaiを設定する
	 *
	 * @param shozai
	 */
	public void setShozai(String shozai) {
		this.shozai = shozai;
	}

	/**
	 * @return buildingStartMinusBuildingDateを取得する
	 */
	public int getBuildingStartMinusBuildingDate() {
	    if ((this.getBuildingDateMonth() == 0) || (this.getBuildingDateYear() == 0)) {
	        return 0;
	    }
	    if ((this.getStartDateYear() == 0) || (this.getStartDateMonth() == 0)) {
	        return 0;
	    }
	    int yearMonth = 0;
	    int months = 0;
	    yearMonth = (this.getStartDateYear() - this.getBuildingDateYear()) * 12;
	    months = this.getStartDateMonth() - this.getBuildingDateMonth();
	    buildingStartMinusBuildingDate = yearMonth + months;
		return buildingStartMinusBuildingDate;
	}

	/**
	 * buildingStartMinusBuildingDateを設定する
	 *
	 * @param buildingStartMinusBuildingDate
	 */
	public void setBuildingStartMinusBuildingDate(int buildingStartMinusBuildingDate) {
		this.buildingStartMinusBuildingDate = buildingStartMinusBuildingDate;
	}

	/**
	 * tateKanyuを取得する
	 *
	 * @return tateKanyu
	 */
	public String getTateKanyu() {
		return tateKanyu;
	}

	/**
	 * tateKanyuを設定する
	 *
	 * @param tateKanyu
	 */
	public void setTateKanyu(String tateKanyu) {
		this.tateKanyu = tateKanyu;
	}
}
