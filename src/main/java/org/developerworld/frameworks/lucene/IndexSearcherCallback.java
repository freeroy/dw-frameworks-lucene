package org.developerworld.frameworks.lucene;

import java.io.IOException;

import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.IndexSearcher;

/**
 * 索引检索回调接口
 * 
 * @author Roy Huang
 * @version 20120822
 * 
 */
public interface IndexSearcherCallback<T> {

	/**
	 * 根据indexSearcher 进行查找
	 * 
	 * @param searcher
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	T doInIndexSearcher(IndexSearcher indexSearcher) throws IOException,
			ParseException;

}
