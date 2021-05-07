<#import "/templates/system/common/cstudio-support.ftl" as studio />

<!DOCTYPE html>
<html lang="en">
	<head>
      <meta charset="utf-8">
      <title>${model.title_t}</title>
	</head>
	<body>
    	Current Date: ${currentDate?datetime?string}</br>
    	Cached Date: ${cachedDate?datetime?string}

		<@studio.toolSupport/>	
	</body>
</html>
