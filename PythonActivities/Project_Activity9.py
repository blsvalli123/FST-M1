import time

from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity9():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    # myAccountLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/my-account/']").click()
    time.sleep(10)
    myAccountLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/my-account/']").click()
    firstloginButton = driver.find_element(By.XPATH,"//div/a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']").click()
    userNameTextBox = driver.find_element(By.ID,"user_login").send_keys("root")
    passwordTextBox = driver.find_element(By.ID,"user_pass").send_keys('pa$$w0rd')
    loginButton = driver.find_element(By.XPATH,"//p/input[@class='button button-primary']").click()
    time.sleep(10)
    allCourserLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/all-courses/']").click()
    playingCourseName = driver.find_element(By.XPATH,"(//div/h3[@class='entry-title'])[1]").text
    firstClassLink = driver.find_element(By.XPATH,"(//p/a[@class='btn btn-primary'])[1]").click()
    time.sleep(30)
    courseProgress = driver.find_element(By.XPATH,"(//div[@class='ld-item-title'])[1]").click()
    time.sleep(20)
    courseHeading = driver.find_element(By.XPATH,"//h3/a[@id='ld-focus-mode-course-heading']").text
    assert courseHeading == playingCourseName

Project_Activity9()


