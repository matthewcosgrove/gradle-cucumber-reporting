#!/bin/bash

cd cucumber-tests || exit
gradle generateCucumberReport
cp -r build/reports/cucumber/cucumber-html-reports/* ../cucumber-report-html
cd ../cucumber-report-html || exit
touch Staticfile
cat << _EOF_ > index.html
<!doctype html>
<html>
<head>
    <title>Cucumber Reports</title>
_EOF_

echo '<meta http-equiv="refresh" content="1; url='${CURRENT_HOST}'/overview-features.html"></head><body></body></html>' >> index.html

ls -ltr
