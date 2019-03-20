package top.tosdom.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;

public class ActivitiDeloyment {
    public static void main(String[] args) {

        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

        RepositoryService repositoryService = processEngine.getRepositoryService();

        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("process.bpmn")
                .addClasspathResource("process.png")
                .name("体检流程")
                .deploy();

        System.out.println(deployment.getId());
        System.out.println(deployment.getName());
    }
}
