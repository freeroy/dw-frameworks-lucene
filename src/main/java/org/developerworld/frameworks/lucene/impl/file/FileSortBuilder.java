package org.developerworld.frameworks.lucene.impl.file;

import org.apache.lucene.search.Sort;
import org.apache.lucene.search.SortField;
import org.developerworld.frameworks.lucene.SortBuilder;

/**
 * 文件排序创建器
 * 
 * @author Roy Huang
 * @version 20120823
 * 
 */
public class FileSortBuilder implements SortBuilder {

	public Sort buildSort() {
		return new Sort(new SortField("lastModified", SortField.LONG, true));
	}

}
