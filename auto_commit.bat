@echo off
cd /d D:\Zeenat_With_Java

git add .

git diff --cached --quiet
if %errorlevel%==0 exit /b

git commit -m "Auto Commit"

git push origin main