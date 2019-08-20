package jp.co.myapp.api.domain.modelreplica;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jp.co.myapp.api.app.data.AbstractResultData;

@JsonInclude(Include.NON_NULL)
public class AddressSearchBean extends AbstractResultData implements Serializable {

	private static final long serialVersionUID = 3507828785766720229L;
	/**
	 * 住所コード(addressCode)
	 */
	private String addressCode;

	/**
	 * 都道府県コード(prefecturesCode)
	 */
	private String prefecturesCode;

	/**
	 * 市区郡コード(cityCountyCode)
	 */
	private String cityCountyCode;

	/**
	 * 町村コード(municipalityCode)
	 */
	private String municipalityCode;

	/**
	 * 枝番(branch)
	 */
	private String branch;

	/**
	 * 新都道府県コード(newPrefecturesCode)
	 */
	private String newPrefecturesCode;

	/**
	 * 新市区郡コード(newCityCountyCode)
	 */
	private String newCityCountyCode;

	/**
	 * 新町村コード(newMunicipalityCode)
	 */
	private String newMunicipalityCode;

	/**
	 * 新枝番(newBranch)
	 */
	private String newBranch;

	/**
	 * カナ都道府県名(kaNaPrefectureName)
	 */
	private String kaNaPrefectureName;

	/**
	 * カナ市区郡名(kaNaCityCountyName)
	 */
	private String kaNaCityCountyName;

	/**
	 * カナ町村・字・通称名(kaNaMunicipalityName)
	 */
	private String kaNaMunicipalityName;

	/**
	 * カナ京都通称名(kanaKyotoName)
	 */
	private String kanaKyotoName;

	/**
	 * カナ旧郵便番号(kanaOldPostalCode)
	 */
	private String kanaOldPostalCode;

	/**
	 * 郵便番号(pstalCode)
	 */
	private String postalCode;

	/**
	 * カナ都道府県文字数(kanaPrefectureCount)
	 */
	private Integer kanaPrefectureCount;

	/**
	 * カナ市区郡文字数(kanaCityCountyCount)
	 */
	private Integer kanaCityCountyCount;

	/**
	 * カナ町村・字・通称文字数(kanaMunicipalityCount)
	 */
	private Integer kanaMunicipalityCount;

	/**
	 * カナ京都通称文字数(kanaKyotoCount)
	 */
	private Integer kanaKyotoCount;

	/**
	 * カナ全文字数(kanaTotalCount)
	 */
	private Integer kanaTotalCount;

	/**
	 * 漢字都道府県名(kanJiPrefectureName)
	 */
	private String kanJiPrefectureName;

	/**
	 * 漢字市区郡名(kanJiCityCountyName)
	 */
	private String kanJiCityCountyName;

	/**
	 * 漢字町村・字・通称名(kanJiMunicipalityName)
	 */
	private String kanJiMunicipalityName;

	/**
	 * 漢字京都通称名(kanjiKyotoName)
	 */
	private String kanjiKyotoName;

	/**
	 * 漢字旧郵便番号(kanjiOldPostalCode)
	 */
	private String kanjiOldPostalCode;

	/**
	 * 漢字郵便番号(kanjiPostalCode)
	 */
	private String kanjiPostalCode;

	/**
	 * 漢字都道府県文字数(kanjiPrefectureCount)
	 */
	private Integer kanjiPrefectureCount;

	/**
	 * 漢字市区郡文字数(kanjiCityCountyCount)
	 */
	private Integer kanjiCityCountyCount;

	/**
	 * 漢字町村・字・通称文字数(kanjiMunicipalityCount)
	 */
	private Integer kanjiMunicipalityCount;

	/**
	 * 漢字京都通称文字数(kanjiKyotoCount)
	 */
	private Integer kanjiKyotoCount;

	/**
	 * 漢字全文字数(kanjiTotalCount)
	 */
	private Integer kanjiTotalCount;

	/**
	 * カナ市区町村(kanaCityCountyMunicipality)
	 */
	private String kanaCityCountyMunicipality;

	/**
	 * 市区町村(cityCountyMunicipality)
	 */
	private String cityCountyMunicipality;

	/**
	 * 住所コード(addressCode)の設定
	 * 
	 * @param addressCode String
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	/**
	 * 住所コードの取得
	 * 
	 * @return addressCode
	 */
	public String getAddressCode() {
		return addressCode;
	}

    /**
     * 都道府県コード(prefecturesCode)の取得
     * 
     * @return prefecturesCode
     */
    public String getPrefecturesCode() {
        return prefecturesCode;
    }

	/**
	 * 都道府県コード(prefecturesCode)の設定
	 * 
	 * @param prefecturesCode String
	 */
	public void setPrefecturesCode(String prefecturesCode) {
		this.prefecturesCode = prefecturesCode;
	}

	/**
	 * 市区郡コード(cityCountyCode)の取得
	 * 
	 * @return cityCountyCode
	 */
	public String getCityCountyCode() {
		return cityCountyCode;
	}

	/**
	 * 市区郡コード(cityCountyCode)の設定
	 * 
	 * @param cityCountyCode String
	 */
	public void setCityCountyCode(String cityCountyCode) {
		this.cityCountyCode = cityCountyCode;
	}

	/**
	 * 町村コード(municipalityCode)の取得
	 * 
	 * @return municipalityCode
	 */
	public String getMunicipalityCode() {
		return municipalityCode;
	}

	/**
	 * 町村コード(municipalityCode)の設定
	 * 
	 * @param municipalityCode String
	 */
	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}

	/**
	 * 枝番(branch)の取得
	 * 
	 * @return branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * 枝番(branch)の設定
	 * 
	 * @param branch String
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * 新都道府県コード(newPrefecturesCode)の取得
	 * 
	 * @return newPrefecturesCode
	 */
	public String getNewPrefecturesCode() {
		return newPrefecturesCode;
	}

	/**
	 * 新都道府県コード(newPrefecturesCode)の設定
	 * 
	 * @param newPrefecturesCode String
	 */
	public void setNewPrefecturesCode(String newPrefecturesCode) {
		this.newPrefecturesCode = newPrefecturesCode;
	}

	/**
	 * 新市区郡コード(newCityCountyCode)の取得
	 * 
	 * @return newCityCountyCode
	 */
	public String getNewCityCountyCode() {
		return newCityCountyCode;
	}

	/**
	 * 新市区郡コード(newCityCountyCode)の設定
	 * 
	 * @param newCityCountyCode String
	 */
	public void setNewCityCountyCode(String newCityCountyCode) {
		this.newCityCountyCode = newCityCountyCode;
	}

	/**
	 * 新町村コード(newMunicipalityCode)の取得
	 * 
	 * @return newMunicipalityCode
	 */
	public String getNewMunicipalityCode() {
		return newMunicipalityCode;
	}

	/**
	 * 新町村コード(newMunicipalityCode)の設定
	 * 
	 * @param newMunicipalityCode String
	 */
	public void setNewMunicipalityCode(String newMunicipalityCode) {
		this.newMunicipalityCode = newMunicipalityCode;
	}

	/**
	 * 新枝番(newBranch)の取得
	 * 
	 * @return newBranch
	 */
	public String getNewBranch() {
		return newBranch;
	}

	/**
	 * 新枝番(newBranch)の設定
	 * 
	 * @param newBranch String
	 */
	public void setNewBranch(String newBranch) {
		this.newBranch = newBranch;
	}

	/**
	 * カナ都道府県名(kaNaPrefectureName)の取得
	 * 
	 * @return kaNaPrefectureName
	 */
	public String getKaNaPrefectureName() {
		return kaNaPrefectureName;
	}

	/**
	 * カナ都道府県名(kaNaPrefectureName)の設定
	 * 
	 * @param kaNaPrefectureName String
	 */
	public void setKaNaPrefectureName(String kaNaPrefectureName) {
		this.kaNaPrefectureName = kaNaPrefectureName;
	}

	/**
	 * カナ市区郡名(kaNaCityCountyName)の取得
	 * 
	 * @return kaNaCityCountyName
	 */
	public String getKaNaCityCountyName() {
		return kaNaCityCountyName;
	}

	/**
	 * カナ市区郡名(kaNaCityCountyName)の設定
	 * 
	 * @param kaNaCityCountyName String
	 */
	public void setKaNaCityCountyName(String kaNaCityCountyName) {
		this.kaNaCityCountyName = kaNaCityCountyName;
	}

	/**
	 * カナ町村・字・通称名(kaNaMunicipalityName)の取得
	 * 
	 * @return kaNaMunicipalityName
	 */
	public String getKaNaMunicipalityName() {
		return kaNaMunicipalityName;
	}

	/**
	 * カナ町村・字・通称名(kaNaMunicipalityName)の設定
	 * 
	 * @param kaNaMunicipalityName String
	 */
	public void setKaNaMunicipalityName(String kaNaMunicipalityName) {
		this.kaNaMunicipalityName = kaNaMunicipalityName;
	}

	/**
	 * カナ京都通称名(kanaKyotoName)の取得
	 * 
	 * @return kanaKyotoName
	 */
	public String getKanaKyotoName() {
		return kanaKyotoName;
	}

	/**
	 * カナ京都通称名(kanaKyotoName)の設定
	 * 
	 * @param kanaKyotoName String
	 */
	public void setKanaKyotoName(String kanaKyotoName) {
		this.kanaKyotoName = kanaKyotoName;
	}

	/**
	 * カナ旧郵便番号(kanaOldPostalCode)の取得
	 * 
	 * @return kanaOldPostalCode
	 */
	public String getKanaOldPostalCode() {
		return kanaOldPostalCode;
	}

	/**
	 * カナ旧郵便番号(kanaOldPostalCode)の設定
	 * 
	 * @param kanaOldPostalCode String
	 */
	public void setKanaOldPostalCode(String kanaOldPostalCode) {
		this.kanaOldPostalCode = kanaOldPostalCode;
	}

	/**
	 * カナ郵便番号(postalCode)の取得
	 * 
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * カナ郵便番号(kanaPostalCode)の設定
	 * 
	 * @param kanaPostalCode String
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * カナ都道府県文字数(kanaPrefectureCount)の取得
	 * 
	 * @return kanaPrefectureCount
	 */
	public Integer getKanaPrefectureCount() {
		return kanaPrefectureCount;
	}

	/**
	 * カナ都道府県文字数(kanaPrefectureCount)の設定
	 * 
	 * @param kanaPrefectureCount Integer
	 */
	public void setKanaPrefectureCount(Integer kanaPrefectureCount) {
		this.kanaPrefectureCount = kanaPrefectureCount;
	}

	/**
	 * カナ市区郡文字数(kanaCityCountyCount)の取得
	 * 
	 * @return kanaCityCountyCount
	 */
	public Integer getKanaCityCountyCount() {
		return kanaCityCountyCount;
	}

	/**
	 * カナ市区郡文字数(kanaCityCountyCount)の設定
	 * 
	 * @param kanaCityCountyCount Integer
	 */
	public void setKanaCityCountyCount(Integer kanaCityCountyCount) {
		this.kanaCityCountyCount = kanaCityCountyCount;
	}

	/**
	 * カナ町村・字・通称文字数(kanaMunicipalityCount)の取得
	 * 
	 * @return kanaMunicipalityCount
	 */
	public Integer getKanaMunicipalityCount() {
		return kanaMunicipalityCount;
	}

	/**
	 * カナ町村・字・通称文字数(kanaMunicipalityCount)の設定
	 * 
	 * @param kanaMunicipalityCount Integer
	 */
	public void setKanaMunicipalityCount(Integer kanaMunicipalityCount) {
		this.kanaMunicipalityCount = kanaMunicipalityCount;
	}

	/**
	 * カナ京都通称文字数(kanaKyotoCount)の取得
	 * 
	 * @return kanaKyotoCount
	 */
	public Integer getKanaKyotoCount() {
		return kanaKyotoCount;
	}

	/**
	 * カナ京都通称文字数(kanaKyotoCount)の設定
	 * 
	 * @param kanaKyotoCount Integer
	 */
	public void setKanaKyotoCount(Integer kanaKyotoCount) {
		this.kanaKyotoCount = kanaKyotoCount;
	}

	/**
	 * カナ全文字数(kanaTotalCount)の取得
	 * 
	 * @return kanaTotalCount
	 */
	public Integer getKanaTotalCount() {
		return kanaTotalCount;
	}

	/**
	 * カナ全文字数(kanaTotalCount)の設定
	 * 
	 * @param kanaTotalCount Integer
	 */
	public void setKanaTotalCount(Integer kanaTotalCount) {
		this.kanaTotalCount = kanaTotalCount;
	}

	/**
	 * 漢字都道府県名(kanJiPrefectureName)の取得
	 * 
	 * @return kanJiPrefectureName
	 */
	public String getKanJiPrefectureName() {
		return kanJiPrefectureName;
	}

	/**
	 * 漢字都道府県名(kanJiPrefectureName)の設定
	 * 
	 * @param kanJiPrefectureName String
	 */
	public void setKanJiPrefectureName(String kanJiPrefectureName) {
		this.kanJiPrefectureName = kanJiPrefectureName;
	}

	/**
	 * 漢字市区郡名(kanJiCityCountyName)の取得
	 * 
	 * @return kanJiCityCountyName
	 */
	public String getKanJiCityCountyName() {
		return kanJiCityCountyName;
	}

	/**
	 * 漢字市区郡名(kanJiCityCountyName)の設定
	 * 
	 * @param kanJiCityCountyName String
	 */
	public void setKanJiCityCountyName(String kanJiCityCountyName) {
		this.kanJiCityCountyName = kanJiCityCountyName;
	}

	/**
	 * 漢字町村・字・通称名(kanJiMunicipalityName)の取得
	 * 
	 * @return kanJiMunicipalityName
	 */
	public String getKanJiMunicipalityName() {
		return kanJiMunicipalityName;
	}

	/**
	 * 漢字町村・字・通称名(kanJiMunicipalityName)の設定
	 * 
	 * @param kanJiMunicipalityName String
	 */
	public void setKanJiMunicipalityName(String kanJiMunicipalityName) {
		this.kanJiMunicipalityName = kanJiMunicipalityName;
	}

	/**
	 * 漢字京都通称名(kanjiKyotoName)の取得
	 * 
	 * @return kanjiKyotoName
	 */
	public String getKanjiKyotoName() {
		return kanjiKyotoName;
	}

	/**
	 * 漢字京都通称名(kanjiKyotoName)の設定
	 * 
	 * @param kanjiKyotoName String
	 */
	public void setKanjiKyotoName(String kanjiKyotoName) {
		this.kanjiKyotoName = kanjiKyotoName;
	}

	/**
	 * 漢字旧郵便番号(kanjiOldPostalCode)の取得
	 * 
	 * @return kanjiOldPostalCode
	 */
	public String getKanjiOldPostalCode() {
		return kanjiOldPostalCode;
	}

	/**
	 * 漢字旧郵便番号(kanjiOldPostalCode)の設定
	 * 
	 * @param kanjiOldPostalCode String
	 */
	public void setKanjiOldPostalCode(String kanjiOldPostalCode) {
		this.kanjiOldPostalCode = kanjiOldPostalCode;
	}

	/**
	 * 漢字郵便番号(kanjiPostalCode)の取得
	 * 
	 * @return kanjiPostalCode
	 */
	public String getKanjiPostalCode() {
		return kanjiPostalCode;
	}

	/**
	 * 漢字郵便番号(kanjiPostalCode)の設定
	 * 
	 * @param kanjiPostalCode String
	 */
	public void setKanjiPostalCode(String kanjiPostalCode) {
		this.kanjiPostalCode = kanjiPostalCode;
	}

	/**
	 * 漢字都道府県文字数(kanjiPrefectureCount)の取得
	 * 
	 * @return kanjiPrefectureCount
	 */
	public Integer getKanjiPrefectureCount() {
		return kanjiPrefectureCount;
	}

	/**
	 * 漢字都道府県文字数(kanjiPrefectureCount)の設定
	 * 
	 * @param kanjiPrefectureCount Integer
	 */
	public void setKanjiPrefectureCount(Integer kanjiPrefectureCount) {
		this.kanjiPrefectureCount = kanjiPrefectureCount;
	}

	/**
	 * 漢字市区郡文字数(kanjiCityCountyCount)の取得
	 * 
	 * @return kanjiCityCountyCount
	 */
	public Integer getKanjiCityCountyCount() {
		return kanjiCityCountyCount;
	}

	/**
	 * 漢字市区郡文字数(kanjiCityCountyCount)の設定
	 * 
	 * @param kanjiCityCountyCount Integer
	 */
	public void setKanjiCityCountyCount(Integer kanjiCityCountyCount) {
		this.kanjiCityCountyCount = kanjiCityCountyCount;
	}

	/**
	 * 漢字町村・字・通称文字数(kanjiMunicipalityCount)の取得
	 * 
	 * @return kanjiMunicipalityCount
	 */
	public Integer getKanjiMunicipalityCount() {
		return kanjiMunicipalityCount;
	}

	/**
	 * 漢字町村・字・通称文字数(kanjiMunicipalityCount)の設定
	 * 
	 * @param kanjiMunicipalityCount Integer
	 */
	public void setKanjiMunicipalityCount(Integer kanjiMunicipalityCount) {
		this.kanjiMunicipalityCount = kanjiMunicipalityCount;
	}

	/**
	 * 漢字京都通称文字数(kanjiKyotoCount)の取得
	 * 
	 * @return kanjiKyotoCount
	 */
	public Integer getKanjiKyotoCount() {
		return kanjiKyotoCount;
	}

	/**
	 * 漢字京都通称文字数(kanjiKyotoCount)の設定
	 * 
	 * @param kanjiKyotoCount Integer
	 */
	public void setKanjiKyotoCount(Integer kanjiKyotoCount) {
		this.kanjiKyotoCount = kanjiKyotoCount;
	}

	/**
	 * 漢字全文字数(kanjiTotalCount)の取得
	 * 
	 * @return kanjiTotalCount
	 */
	public Integer getKanjiTotalCount() {
		return kanjiTotalCount;
	}

	/**
	 * 漢字全文字数(kanjiTotalCount)の設定
	 * 
	 * @param kanjiTotalCount Integer
	 */
	public void setKanjiTotalCount(Integer kanjiTotalCount) {
		this.kanjiTotalCount = kanjiTotalCount;
	}

	/**
	 * カナ市区町村(kanaCityCountyMunicipality)の取得
	 * 
	 * @return kanaCityCountyMunicipality
	 */
	public String getKanaCityCountyMunicipality() {
		return kanaCityCountyMunicipality;
	}

	/**
	 * カナ市区町村(kanaCityCountyMunicipality)の設定
	 * 
	 * @param kanaCityCountyMunicipality String
	 */
	public void setKanaCityCountyMunicipality(String kanaCityCountyMunicipality) {
		this.kanaCityCountyMunicipality = kanaCityCountyMunicipality;
	}

	/**
	 * 市区町村(cityCountyMunicipality)の取得
	 * 
	 * @return cityCountyMunicipality
	 */
	public String getCityCountyMunicipality() {
		return cityCountyMunicipality;
	}

	/**
	 * 市区町村(cityCountyMunicipality)の設定
	 * 
	 * @param cityCountyMunicipality String
	 */
	public void setCityCountyMunicipality(String cityCountyMunicipality) {
		this.cityCountyMunicipality = cityCountyMunicipality;
	}
}