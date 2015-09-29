package org.developerworld.frameworks.lucene.impl.jdbc;

import org.developerworld.frameworks.lucene.impl.collection.MapSortBuilder;

/**
 * jdbc Resultset创建器
 * 
 * @author Roy Huang
 * @version 20120907
 *
 */
public class JdbcResultSetSortBuilder extends MapSortBuilder {

	public JdbcResultSetSortBuilder(String column, boolean reverse) {
		super(column, reverse);
	}

}
