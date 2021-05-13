package cn.zk.service;

import cn.zk.pojo.ResultModel;

/**
 *
 */
public interface SearchService {
    public ResultModel query(String queryString, String price, Integer page) throws Exception;
}
