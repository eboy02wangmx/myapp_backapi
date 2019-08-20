package jp.co.myapp.api.app.request;

import jp.co.myapp.common.ConstantsEnum.SEQUENCE_TYPE;

public class NumberingRequest {

	/**
	 * シーケンス区分
	 */
	private SEQUENCE_TYPE sequenceType;

	/**
	 * シーケンス区分の取得
	 * 
	 * @return sequenceType
	 */
	public SEQUENCE_TYPE getSequenceType() {
		return sequenceType;
	}

	/**
	 * シーケンス区分の設定
	 * 
	 * @param sequenceType
	 *            シーケンス区分
	 */
	public void setSequenceType(SEQUENCE_TYPE sequenceType) {
		this.sequenceType = sequenceType;
	}

}
