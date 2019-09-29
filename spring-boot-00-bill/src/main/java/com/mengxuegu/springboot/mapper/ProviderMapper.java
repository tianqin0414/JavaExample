package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Provider;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
public interface ProviderMapper {


    List<Provider> getProviders(Provider provider);

    Provider getProviderByPid(Integer pid);

    int addProvider(Provider provider);

    int updateProvider(Provider provider);

    int deleteProviderByPid(Integer pid);

}
