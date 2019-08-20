package jp.co.myapp.api.domain.repository.acceptlimit;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;

import jp.co.myapp.api.app.request.AcceptLimitInputRequest;

public interface AcceptLimitInputRepository {

	/**
	 *
	 * @param entryNo
	 * @param agencyCd
	 * @return
	 * @throws SQLException
	 */
	public int countByEntryNoAndAgencyCd(@Param("entryNo") String entryNo, @Param("agencyCd") String agencyCd) throws SQLException;

	/**
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int updateAcceptLimitInput(AcceptLimitInputRequest params) throws Exception;

	/**
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int insertAcceptLimitInput(AcceptLimitInputRequest params) throws Exception;

}
