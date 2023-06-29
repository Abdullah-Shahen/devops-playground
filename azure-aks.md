# Azure Kubernetes Service AKS

## What is Azure Kubernetes Service (AKS)?
Azure Kubernetes Service (AKS) is a managed container orchestration service provided by Microsoft Azure. It simplifies the deployment, management, and scaling of containerized applications using Kubernetes. AKS abstracts away complexities, automates scaling and load balancing and integrates with other Azure services.

## AKS Architecture
Here is a simplified overview of AKS architecture:
### Control Plane
AKS manages the control plane, which consists of the Kubernetes master components. These components include the API server, etcd, scheduler, and controller manager. The control plane is responsible for managing and coordinating the cluster's resources and workload scheduling.
### Worker Node(s)
Worker nodes are instances where your containerized applications run. Each node is a virtual machine provisioned by Virtual Machine Scale Set (VMSS) and is part of an availability set for increased fault tolerance. Nodes run the Kubernetes runtime components, including the kubelet, which manages containers on the node, and the kube-proxy, which handles networking.
### Networking
AKS integrates with Azure Virtual Network (VNet) to provide networking capabilities to the AKS cluster. Each node gets assigned a private IP address, and container-to-container communication is facilitated through an overlay network. AKS also supports Azure Container Networking Interface (CNI) for advanced networking scenarios.
### Azure Load Balancer
AKS leverages Azure Load Balancer to distribute incoming traffic to the services running in the cluster. It provides a public IP address or a fully qualified domain name (FQDN) for external access to the applications.
### Azure Disk Storage
Azure Disk Storage is utilized to provide persistent storage for your applications. It allows you to mount Azure disks as volumes in your containers, enabling data persistence across pod restarts or node failures.
### Azure Container Registry (ACR)
ACR can be used as a private registry to store and manage container images used in AKS. It provides secure image storage and supports features like geo-replication for high availability or image vulnerability scanning for enhanced security.
## How to Deploy AKS Cluster using Terraform
TBD
