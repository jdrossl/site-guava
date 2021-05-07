import java.util.concurrent.Callable

def dateCache = applicationContext.dateCache

templateModel.currentDate = new Date()
templateModel.cachedDate = dateCache.get("test")