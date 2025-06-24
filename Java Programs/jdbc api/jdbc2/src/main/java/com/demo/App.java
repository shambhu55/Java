package com.demo;

import java.util.List;
import java.util.Map;

import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        EmployeeDao ed = new EmployeeDao();
        
        // to insert Employee
//        String[] companies = {
//                "Google", "Microsoft", "Apple", "Amazon", "Facebook", "IBM", "Oracle", "SAP", "Salesforce",
//                "Adobe", "Intel", "Cisco", "Dell", "HP", "VMware", "Infosys", "TCS", "Wipro", "HCL Technologies", "Accenture",
//                "Capgemini", "Cognizant", "Tech Mahindra", "L&T Infotech", "Mindtree", "Mphasis", "Genpact", "DXC Technology",
//                "Atos", "NTT Data", "Fujitsu", "Huawei", "Qualcomm", "AMD", "Nvidia", "Uber", "Lyft", "Airbnb", "Twitter", "Zoom",
//                "Red Hat", "ServiceNow", "Workday", "Square", "PayPal", "Shopify", "Dropbox", "Slack", "Atlassian", "GitHub",
//                "Stripe", "Snowflake", "Splunk", "Palantir", "CrowdStrike", "Cloudflare", "LinkedIn", "Pinterest", "TikTok",
//                "Samsung", "Xiaomi", "Alibaba", "Tencent", "Baidu", "ZTE", "LG Electronics", "Sony", "Seagate", "Western Digital",
//                "Micron Technology", "Broadcom", "Ericsson", "Nokia", "Motorola Solutions", "Zebra Technologies",
//                "Autodesk", "Synopsys", "Cadence Design Systems", "Unity Technologies", "Epic Games", "Roblox",
//                "Electronic Arts", "Activision Blizzard", "Ubisoft", "Square Enix", "SAP Concur", "Qualtrics",
//                "Roku", "Yelp", "Zillow", "DocuSign", "Intuit", "NortonLifeLock", "McAfee", "Fortinet", "Trend Micro",
//                "Check Point Software", "Palo Alto Networks", "Blue Prism", "Pegasystems", "Teradata", "OpenText",
//                "Confluent", "Elastic", "Databricks", "Nutanix", "DigitalOcean", "Fastly", "HashiCorp"
//            };
//    	String[] designations = {
//                "Software Engineer", "Senior Software Engineer", "Full Stack Developer", "Backend Developer",
//                "Frontend Developer", "Mobile App Developer", "DevOps Engineer", "Cloud Engineer",
//                "Data Scientist", "Machine Learning Engineer", "AI Engineer", "Big Data Engineer",
//                "Data Analyst", "Business Intelligence Analyst", "Database Administrator", "Data Engineer",
//                "Cybersecurity Analyst", "Security Engineer", "Ethical Hacker", "Network Engineer",
//                "System Administrator", "Site Reliability Engineer", "IT Support Specialist",
//                "Technical Support Engineer", "Help Desk Technician", "QA Engineer", "Test Automation Engineer",
//                "Performance Test Engineer", "Software Architect", "Technical Architect", "Solutions Architect",
//                "Enterprise Architect", "Product Manager", "Project Manager", "Scrum Master", "Agile Coach",
//                "Business Analyst", "UI/UX Designer", "UI/UX Developer", "Graphic Designer", "Web Developer",
//                "Embedded Systems Engineer", "IoT Engineer", "Game Developer", "VR/AR Developer",
//                "Blockchain Developer", "Smart Contract Developer", "SAP Consultant", "ERP Consultant",
//                "IT Consultant", "IT Auditor", "IT Manager", "IT Director", "CTO (Chief Technology Officer)",
//                "CIO (Chief Information Officer)", "Chief Data Officer", "Software Development Manager",
//                "Release Manager", "Version Control Engineer", "Build Engineer", "Automation Engineer",
//                "Network Security Engineer", "Cloud Security Engineer", "System Security Engineer",
//                "Penetration Tester", "IT Compliance Analyst", "SOC Analyst", "Incident Response Analyst",
//                "Threat Intelligence Analyst", "Firmware Engineer", "Hardware Engineer", "Storage Engineer",
//                "Infrastructure Engineer", "Platform Engineer", "Virtualization Engineer",
//                "IT Operations Manager", "IT Risk Analyst", "IT Governance Specialist", "Digital Forensics Analyst",
//                "Linux Administrator", "Windows Administrator", "SharePoint Administrator", "Exchange Administrator",
//                "CRM Developer", "Salesforce Developer", "Oracle Developer", "Database Developer",
//                "AI Research Scientist", "Natural Language Processing Engineer", "Computer Vision Engineer",
//                "Robotics Engineer", "Automation Tester", "Middleware Engineer", "Configuration Manager",
//                "Release Coordinator", "Cloud Solutions Architect", "Hybrid Cloud Engineer", "IT Trainer",
//                "Technical Writer", "Software Documentation Specialist", "Open Source Contributor",
//                "Technology Evangelist", "IT Support Manager"
//            };
//    	
//    	Random r = new Random();
//    	for(int i=1; i<=5000; i++) 
//    	{
//    		Employee e = new Employee();
//    		e.setCompany(companies[r.nextInt(companies.length)]);
//    		e.setDesignation(designations[r.nextInt(designations.length)]);
//    		e.setSalary(r.nextInt(201)*10000);
//    		
//    		StringBuilder sb = new StringBuilder();
//    		for(int j=1; j<=15; j++)
//    			sb.append((char)(r.nextInt(26)+65));
//    		e.setName(sb.toString());
//    		
//    		System.out.println(ed.insertEmployee(e));
//        }
        
        
        
        // to delete employee
//        int check = ed.deleteEmployeeById(26);
//        System.out.println(check);
        
        
        // Display By id
//        Employee e = ed.findEmployeeById(4);
//    	System.out.println(e);
        
        
        // Find All Employee
//        List<Employee> list = ed.findAllEmployee();
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Update Employee
//        Employee e = ed.findEmployeeById(4);
//        e.setName("Sanju Baba");
//        System.out.println(ed.updateEmployee(e));
        
        
        // Find Employee on Condition,(Less than salary)
//        List<Employee> list = ed.findEmployeeBySalaryLessThan(40000);
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find Employee on Condition,(Between Salary)
//        List<Employee> list = ed.findEmployeeBySalaryBetween(30000, 40000);
//        for(Employee e:list)
//      		System.out.println(e);
        
        
        // Find Employee on Condition,( Not Between Salary)
//        List<Employee> list = ed.findEmployeeBySalaryNotBetween(30000, 40000);
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find Employee by Name and COmpany
//        List<Employee> list = ed.findEmployeeByNameAndCompany("ZLLTLYCIXAXTKGE", "Seagate");
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find Employee by Name or COmpany
//        List<Employee> list = ed.findEmployeeByNameOrCompany("Sanju Baba", "Seagate");
//        for(Employee e:list)
//        	System.out.println(e);
        
      
        // Find Employee by Name like
//        List<Employee> list = ed.findEmployeeByNameLike("rrr");
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find Employee by Any
//        List<Employee> list = ed.findByAny("555");
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find All names
//      List<String> list = ed.findAllName();
//      for(String e:list)
//      	System.out.println(e);
        
        
        // Find All Companies and Designations
//        Map<String, List<String>> m = ed.findCompanyAndDesignation();
//        List<String> listOfCompanies = m.get("listOfCompanies");
//        List<String> listOfDesignations = m.get("listOfDesignations");
//        for(int i=0; i<listOfCompanies.size(); i++)
//        	System.out.println(listOfCompanies.get(i)+"\t\t"+listOfDesignations.get(i));
        
        
        // Find Highest Salary
//        double salary =ed.findHighestSalary();
//        System.out.println(salary);
        
        
        // Find Employee with Highest Salary
//        List<Employee> list = ed.findHighestSalaryEmployee();
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find Employee with Second Highest Salary
//        List<Employee> list = ed.findSecondHighestSalaryEmployee();
//        for(Employee e:list)
//        	System.out.println(e);
        
        // Find Employee with Third Highest Salary
//        List<Employee> list = ed.findThirdHighestSalaryEmployee();
//        for(Employee e:list)
//        	System.out.println(e);
        
        
        // Find Employee with Lowest Salary
//      List<Employee> list = ed.findLowestSalaryEmployee();
//      for(Employee e:list)
//      	System.out.println(e);
      
      
      // Find Employee with Second Highest Salary
//    List<Employee> list = ed.findSecondLowestSalaryEmployee();
//    for(Employee e:list)
//    	System.out.println(e);
        
        
        // Find Employee with Third Highest Salary
//      List<Employee> list = ed.findThirdLowestSalaryEmployee();
//      for(Employee e:list)
//      	System.out.println(e);
        
        
        // Find Employee with Highest Salary in Spacex
      List<Employee> list = ed.findHighestSalaryEmployeeInCompany();
      for(Employee e:list)
      	System.out.println(e);
    }
}
