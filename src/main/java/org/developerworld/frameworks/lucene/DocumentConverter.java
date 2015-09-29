package org.developerworld.frameworks.lucene;

import org.apache.lucene.document.Document;

/**
 * 文档转换器
 * @author Roy Huang
 * @version 20120822
 * 
 * @param <T>
 */
public interface DocumentConverter<T> {

	/**
	 * 文档转换为对象
	 * @param doc
	 * @return
	 */
	public T documentToData(Document doc);

	/**
	 * 对象转换为文件
	 * @param data
	 * @return
	 */
	public Document dataToDocument(T data);
}
