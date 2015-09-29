package org.developerworld.frameworks.lucene;

import org.apache.lucene.index.IndexReader;

/**
 * 索引阅读器回调接口
 * @author Roy Huang
 * @version 20120823
 *
 * @param <T>
 */
public interface IndexReaderCallback<T> {

	/**
	 * 回调方法
	 * @param reader
	 * @return
	 */
	public T doInIndexReader(IndexReader reader);

}
