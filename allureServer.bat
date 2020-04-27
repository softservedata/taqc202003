@echo off

echo ARGUMENTS %1 %2 %3 %4 %5

rem set path=.\.allure\allure-2.0.1\bin\;%path%

rem .allure\allure-2.0.1\bin\allure serve target\allure-results

rem allure serve target\allure-results

allure serve allure-results

echo Press any key to continue ...
pause
