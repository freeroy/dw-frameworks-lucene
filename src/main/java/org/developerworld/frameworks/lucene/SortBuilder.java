package org.developerworld.frameworks.lucene;

import org.apache.lucene.search.Sort;

/**
 * 排序创建器
 * @author Roy Huang
 * @version 20120823
 *
 */
public interface SortBuilder {

	public Sort buildSort();
	
}
