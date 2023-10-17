```
minikube start
gradle build
minikube image build -t hello .
kubectl apply -f kubernetes/
kubectl logs --follow deployments/hello-deployment
```
