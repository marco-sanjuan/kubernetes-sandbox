## Kubernetes/Minikube local deploy

### Prepare system
1. Install Minikube: https://kubernetes.io/es/docs/tasks/tools/install-minikube/
1. Start minikube, I use:

    `minikube start --cpus 4 --memory 7680`
1. Test cluster:
    
    `kubectl cluster-info` 

### Build app image into minikube
1. Build app: `mvn clean package`
1. Set the environment variables to point docker to kubernetes cluster:

    `eval $(minikube docker-env)`
    
1. Build the image with the Docker daemon of Minikube
  
    `docker build -t mini-app .`
   
1. Test image availability

    `kubectl run mini-app-deployment --image=mini-app --port=8080 --image-pull-policy=Never`


### Running the service
1. Create **deployment**: 
    
    Important: Set the imagePullPolicy to Never, otherwise Kubernetes will try to download the image.
    
    `kubectl apply -f mini-app-deploy.yml`
1. Create **service**: 

    `kubectl apply -f mini-app-svc.yml`
1. Get the **url to service**: 

    `minikube service mini-app --url`
1. Test url on browser.