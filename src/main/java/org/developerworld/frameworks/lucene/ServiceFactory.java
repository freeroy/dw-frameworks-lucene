package org.developerworld.frameworks.lucene;

/**
 * 
 * 服务工厂
 * 
 * @author Roy Huang
 * @version 20120822
 *
 * @param <T>
 */
public interface ServiceFactory<T> {

	/**
	 * 创建搜索服务
	 * 
	 * @return
	 */
	SearchService<T> buildSearchService();

	/**
	 * 创建索引服务
	 * 
	 * @return
	 */
	IndexService<T> buildIndexService();

}
