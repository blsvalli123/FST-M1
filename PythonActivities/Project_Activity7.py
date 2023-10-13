import time

from selenium import webdriver
from selenium.webdriver.common.by import By

def Project_Activity6():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    # myAccountLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/my-account/']").click()
    time.sleep(10)
    allCourserLink = driver.find_element(By.XPATH,"//a[@href='https://alchemy.hguy.co/lms/all-courses/']").click()

    courserList = driver.find_elements(By.XPATH, "//div/h3[@class='entry-title']")
    courserListSize = len(courserList)
    print(courserListSize)

Project_Activity6()