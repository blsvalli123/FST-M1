import time

from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity8():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    contactLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/contact/']").click()

    fullNameTextBox = driver.find_element(By.XPATH,"//input[@id='wpforms-8-field_0']").send_keys('FST Test Team')
    emailTextBox = driver.find_element(By.XPATH,"//input[@id='wpforms-8-field_1']").send_keys('fsttestTeam@gmail.com')
    messaeTextBox = driver.find_element(By.XPATH,"//textarea[@id='wpforms-8-field_2']").send_keys('Great Courses. Thank you !!')
    sendMessageButton = driver.find_element(By.XPATH,"//button[@id='wpforms-submit-8']").click()
    returnMessage = driver.find_element(By.XPATH,"//div[@id='wpforms-confirmation-8']/p").text

    print(returnMessage)
Project_Activity8()