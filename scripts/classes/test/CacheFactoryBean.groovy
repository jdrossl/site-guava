package test

import com.google.common.cache.CacheBuilder
import com.google.common.cache.CacheLoader
import com.google.common.cache.LoadingCache
import org.springframework.beans.factory.config.AbstractFactoryBean

class CacheFactoryBean extends AbstractFactoryBean<LoadingCache<String, Date>> {

    def cacheSpec;

    @Override
    Class<?> getObjectType() {
        return LoadingCache.class
    }

    @Override
    protected LoadingCache createInstance() throws Exception {
        return CacheBuilder.from(cacheSpec).build({ k -> new Date() } as CacheLoader<String, Date>)
    }

    @Override
    protected void destroyInstance(LoadingCache instance) throws Exception {
        instance.invalidateAll()
        instance.cleanUp()
    }

}
