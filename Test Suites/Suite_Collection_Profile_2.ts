<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Suite_Collection_Profile_2</name>
   <tag></tag>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>QA_Environment</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Suite_Profile_1</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>UAT_自然环境</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Suite_Profile_2</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
