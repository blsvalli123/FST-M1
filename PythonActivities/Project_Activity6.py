import time

from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity6():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    myAccountLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/my-account/']").click()
    time.sleep(10)
    myAccountTitle = driver.title
    assert myAccountTitle =="My Account – Alchemy LMS"
    print(myAccountTitle)

    firstloginButton = driver.find_element(By.XPATH,"//div/a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']").click()
    time.sleep(10)
    userNameTextBox = driver.find_element(By.ID,"user_login").send_keys("root")
    passwordTextBox = driver.find_element(By.ID,"user_pass").send_keys('pa$$w0rd')
    loginButton = driver.find_element(By.XPATH,"//p/input[@class='button button-primary']").click()
    time.sleep(10)
    userDisplayName = driver.find_element(By.XPATH,"(//span[@class='display-name'])[1]").text
    assert userDisplayName == "root"

    print(userDisplayName)


Project_Activity6()