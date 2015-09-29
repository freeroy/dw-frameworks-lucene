package org.developerworld.frameworks.lucene.impl.collection;

import org.apache.lucene.search.Sort;
import org.apache.lucene.search.SortField;
import org.developerworld.frameworks.lucene.SortBuilder;

/**
 * map数据排序创建器
 * @author Roy Huang
 * @version 20120907
 *
 */
public class MapSortBuilder implements SortBuilder {

	private String key;
	private boolean reverse;

	public MapSortBuilder(String key, boolean reverse) {
		this.key = key;
		this.reverse = reverse;
	}

	public Sort buildSort() {
		return new Sort(new SortField(key, SortField.STRING, reverse));
	}

}
