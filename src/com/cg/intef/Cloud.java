package com.cg.intef;

import java.lang.reflect.Parameter;

import javax.annotation.processing.Processor;

import org.w3c.dom.Node;

public class Cloud {

}
 
Cloud based deployment:-
you can migrate existing applications to the cloud or you can design and build new applications
in the cloud. you can build those applications on lowel level infrastructure that requires
your IT staff to manage them. Alternatively, you can build them using higher level servies 
that reduce the management, archutecting, and scaling requirements of thr core infrastructu

you can migrate 
example- a company might create an application consisting of virtual servers, databases and 
networking componenets that are fully based in the cloud.

Benefits of cloud computing:-
trade upfront expense for variable expense
stop spending money to run and maintain data centers
stop guessing capacity 
benefit from massive economics of scale
increase speed and agility
go global in minutes


access control list: a document that defines who can access a particular bucket or object.Each
bucket and objet in amazon s3 has an ACL. This doument defines what eah type of user can do, such
as write and read permissions.

Access key: The combination od an access key ID and a secret access key. 

Access key ID:- A unique identifier that is associated with a secret access key; the access
key ID and secret acess key are used together to sign programatic aws requests cryptographically.

Access key rotation:- A method to increase security by changing the aws access key ID.
you can use this method to retire an old key at your discretion.

Access policy language:
	A language for writing documents that specify who can access a particular aws resource
	and under what conditions.
Access activity:-
a webpage showing your month-to-date aws usage and costs. The account activity page is 
located at

AWS Account Management:-
AWS account management is a tool that you can use to update the contact for each of your
aws accounts.

ACM:-
AWS certifcate manager is a web service for provisioning , managing and deploying secure sockets
layer certificates for use with aws services.

Action:- An Api function also called operation or call. The activity the pricipal has permission to
perform. The action B in the statement A has permission to do B to C where D applies.

Cloud watch:- The response initiated by the change in an alarms state
ex:- From OK to Alarm.

Additional authenticated data:-
   Information that is checked for integrating but not encrypted, such as headers or  other
   contextual metadata.
 
Administrative Suspension:
	Amazon EC2 auto scaling might suspend process for auto scaling group that repeatedly fail 
	to launch instances auto scaling groups that mostly commonly. Experience adminstrative suspension
	have zero running instances, have been trying to launch instances for more than 24 hours and have
	not succeded in that time.
	administrative suspension:
		Amazon EC2 auto scaling might suspend process for auto scaling group that repeatedly  fail
		to launch instances auto scaling groups that mostly commonly. experience adminstrative suspension 
		have zero running instances, have been tring to launch instances for more than 24 hours and have
		not succeded in that time. 
		
Alarm:-
    An item that watches a single metric over a specified time period and starts an amazon SNS topic or
    an Amazon EC2 Auto scaling policy. These actions are started if the value of the m etric crosses a thresold 
    value over a predetermined no.of time periods.
    
Allow:-
    One of two possible outcomes when an IAM access policy is evaluated . When a user makes a request to aws,
    AWS evalutes the request based on all permisiions that to the user and then returns either allow or deny.
    
 Amazon Machine Image(AMI):-
     An Amazon machine image is an encrypetd machine image in amazon s3 . AMIs fuction similarly to a template
     of a computers's  root drive. They contain the operating system and also include software and layers of your
     application, such as database servers , middleware and web servers.
 Amazon web services:-
     An infrastructure web services platform in the cloud for companies of all sizes.
 Amplify:-
      AWS Amplify is a complete solution that fornted web and mobile developers can use to build and deploy
      secure, scalable full stack applications powered by AWS. Amplify provides two services; Amplify hosting
      and Amplify studio.
      
Amplify Android:-
     Amplify Android is a collection of open source client libraries that provides intefaces for specific use 
     cases across many aws services. Amplify Android is the reccommended way to build native android application
     powered by AWS. 
Amplify Hosting:-
     AWS Amplify hosting is a fully managed continuous integration and continuous delievery and hosting service
     for fast, secure , and reliable static and server-side rendered apps. Amplify hosting provides a git- based workflow
     for hosting full-stack serverless web apps with continuous deployment.
     
Amplify Ios:-
     Amplify ios is a collection of open source client libraries that provides interfaces for specific use cases across
     many aws services. Ampify ios is the recommended way to build native ios applications powered by aws.
     
Amplify studio:-
     AWS Amplify studio is a visual development environment that web mobile developers can use a build the fronted ui concepts
     and the backend environment for a full stack application.
Analysis scheme:-
     Language specific text analysis options that are applied to a text field to control stemming and configuare stopwords 
     and synonyms.
Api Gateway:-  
     Amazon Api gateway is fully managed service that developers can use to create, publish , maintain,monitor and secure
     apis at any scale.
     
AWS App2 Container:-
     AWS app2 container is a transformation tool that moderizes .net and java applications by migrating them into containerized
     applications.
AWS App Config:-
    AWS AppConfig is a service used to update software at runtime without deploying new code.with aws appconfig, you can configure
    validate, and deploy features flags and application configurations.
Amazon APPflow:-
    Amazon Appflow is a fully managed integration service you can use to transfer data securely between as a service applications
    and aws services.
    
Elastic Beanstalk:-
    A logical colletion of components, including environments, versions, and environment configurations . An application is conceptually
    similar to a folder.
Code deploy:-
    A name that uniquely identifies the application to be deployed. AWS code deploy uses this name to ensure the correct combination of
    revision, deployment configuration, and deployment group are referenced during a deployment.
    
Application Auto Scaling:-
    AWS application auto scaling is a web service that you can use to configure automatic scaling for aws resources beyond amazon EC2, 
    such as Amazon ECS services , Amazon EMR clusters and DynamoDB tables.
    
Application Billing:-
    The location where your customers manage the amazon devpay products they've purchased.
Application Composer:-
    AWS Application composer is a visual designer that you can use to build. serverless applications from multiple aws services. As you 
    design an applications, application composer automatically generates a Yaml template with cloud formation and aws SAM template resourcse.
    
Application Cost profiler:-
    AWS Application cost profiler is a solution to track the cons umption of shared aws resources used by software applications and report granular cost 
    breakdown across tenant base.
    
Application Discovery service:-
AWS Application Discovery service is a web service that helps you plan to migrate to AWS by identifying IT assets in a data center including
servers, virtual machines,applications , application dependencies and network infrastructure.
  
Application Discovery service:-
AWS Application discovery service is a web service that helps you plan to migrate to AWS by identifying IT assests in a data center including 
servers,virtual machines,applications, application dependencies and network infrastructure

Application revision:-
Code deploy:- An archeive file containing sources content such as source code, web pages, executable files and deployment scripts along with an application
specification file . Revisions are stored in amazon s3 buckets or Github repositories.
 For amazon S3- A revision is uniquely identified by its amazon s3 object key and its ETag, version or both.
 For Github - A revision is uniquely identified by its commit ID.
 
Application Specification file:-
Code deploy:- A yaml- formatted file used to map the source files in an application revision to destinations on the instance. The file is also used to specify
custom permissions for deployed files and specify scripts to be run on each instance at various stages of the deployment process.

Application version:-
Elastic BeanStalk:- A specific, labeled iteration of an application that represnts a functionality consistent set of deployable application code. A version points
to an Amazon s3 object that contains the application code.

App Stream 2.0:-
Amazon App stream 2.0 is a fully managed, secure service for streaming desktop applications to users with out rewriting those applications.

AWS App Sync:-
AWS App sync is an enterprise-level, fully managed graph Al service with real-time data synchronization and offline programming features.

Codepipeline:- A copy of the files or changes that are worked or by the pipeline.

Asymetric encryption:-
   Encryption that uses both a public key and a private key.
Asynchronous bounce:-
   A type of bounce that occurs when a receiver initially accepts an email meaasge for delivery and then subsequently fails to deliver it.
   
Athena:-
Amazon athena is an iterative query service that you can use to analyze data in amazon s3 using ANSI SQL. Athena scales automatically and is
simple to use, so you can start analyzing your datasets within seconds.

Automatic Coounter:-
DynamoDB:- A method of incrementing or decrementing the value of an existing attribute without interferring with other write requets.

Attribute:-
A fundamental data element , something that doesnt need to be broken down any further. In Dynomo Db, attributes are similar in many ways to
fileds or columns in other database systems.
    
Amazon machine learning:- A unique , named property within an observation in a dataset. In tabular data, such as spreadsheets or comma separeted values .csv files
the column headings represent the attributes, and the rows contain values for each attributes.

AVC:- Area under a curve an industry standard metric to evaluate the quality of a binary classifiation machine learning model avc measures the ability
of the model to predict a higher score for positive exs, those are correct than for negative exs, those are incorrect.

Aurora:- Amazon Aurora is fully managed mysql-compatible relational database engine that combines the speed and availability of commercial databases with
the simplicity and cost-effectiveness of open source databases.

Authenticated encryption:- Encryption that provides confidentiality, data integrity and authenticity assurances of the encrypted data.

Authentication:- The process of providing your identity to a system

AWS auto scaling:-
  AWS auto scaling is a fully managed service that you can use to quickly discover the scalable asw resources that are part of your
  application and to configure dynamic scaling.

Auto Scaling group:-  
  A representation of multiple ec2 instances that share similar characteristics,and that are treated as a logical grouping for the 
  purpose of instance scaling and management.
  
  auto scaling group:-
  A representation of multiple ec2 instances that share similar characteristics,and that are treated as a logical grouping for the 
  purpose of instance scaling and managemet.
  
Availability Zone:-
  A distinct location within A region that is insulated from failures in other availability zones, and provides in expensive, low
  latency network connectivity to other availability zones in the same region.
  
  Avalibility zone:-
  a distinct location within A region that is insulated from failures in other availability zones, and provides in expensive, low
  latency network connetivity to other avalibility zones in the same regoin.
  
BBBB:-

Backient Agent:-
   AWS Backeint Agent for SAP HANA-certified backup and restore solution for SAP HANA workloads running on Amazon EC2 instances in the cloud.
   
AWS Backup:-
   AWS Backup is a managed backup service that you can use to centralize and automate the backup of data across aws services in the cloud and on-premises.
   
Basic Monitoring:-
   Monitoring of AWS provided metrics derived at a 5 minute frequency.
   
Batch prediction
Amazon Machine learning:- An operation that processes multiple input data observations at one time, unlike real-time predictions, batch predictions aren't
available until all predictions have been processed.

Batch prediction
Amazon machine learing:- an opertion that processes multiple input data observations at one time, unlike real-time predictions, batch predication aren't
available until all predication have been processed.

BGP ASN:-
Border Gateway protocol autonomous system number is a unique identifier for a network, for use in BGP routing.Amazon EC2 supports all 2-byte ASN numbers in
the range of 1-65335 , with the exception of 7224, which is reversed.

BGP ASN:-
Border Gateway protocol autonomous system number is a unique identifier for a network, for use in BGP routing.Amazon EC2 supports all 2-byte ASN numbers in
the range of 1-65335, with the exception of 7224, which is reversed.

Block:-
A dataset Amazon EMR breaks large amounts of data into subsets.Each subset is called a data block.Amazon EMR assigns an Id to each block and uses a hash table 
to keep track of block processing.

Block device:-
A storage device that supports reading and writing data in fixed-sizd blocks, setors or clusters.
 
Block device mapping:-
A mapping struture for every AMI and instance that specifies the block devices attached to the instance .

Blue /green deployment:-
CodeDeploy:- A deloyment method where the instance in a deployment group are replaced by a different set of instances.

Bootstrap action:-
A user-specified default or custom action that runs a script or an application on all nodes of a job flow before hadoop starts.

Bounce:-
A failed email delivery attempt.

Bracket:- Amazon Braket is a fully managed quantum computing service that helps you run quantum algorithms to accelarate your research
and discovery.

Breach:-
Amazon EC2 Auto Scaling:- The condition where a user-set thresold is passed.If the duration of the breach is siginicant, as set by a breach duration
parameter, it can possibly start a scaling activity.

Bucket:-
Amazon s3:- A container for stored objects .Every object is contained in a bucket.
Bucket owner:- The person or organisation that owns a bucket in amazon s3.In the same way that amazon is the only owner of the domain name amazon.com,
only one person or organization can own a bucket.
  
bucket:-
Amazons s3:- A container for stored  objects . Every object is contained in a bucket.
bucket owner:- The person or organisation that owns a bucket in amazon s3. In the same way that amax
Bundling:-
A commonly used term for creating an amazon machine image (ami).It specifically refers to creating instance store-backed Amis.


CCCC:-
Cache Cluster:-
A logical cache distributed over multiple cache nodes.A cache cluster can be set up with a specific no.of cache nodes.

Cache cluster identifier:-
Customer-supplied identified for the cache cluster that must be unique for that customer in an aws region.

Cache engine version:-
The version of the memcached service that is running on the cache Node.ATTRIBUTE_NODE

Cache node:-
A fixed-size chunk of secure, network attched RAM. Each cache node runs an instance of the memcached service, and has its own DNS name and ports.
multiple types of cache notes are supported, each with varying amounts of associated memory.

Cache node type:-
An EC2 instance type used to run the cache node.

Cache parameter group:-
A container for cache engine Parameter values that can be applied to one or more cache clusters.

Cache security group:-        
A group maintained by elesaticcache that combines inbound authorizations to cache nodes for hosts belonging to amazon ec2 security groups that
are specified through the console or the api or commandline line tools.

Campaign:-Trained model with provisioned dediated transaction capacity for creating real-time recommendations for your application users.

Canned access policy:-
A standard access control policy that you can apply to a bucket or object.options include:private,public-read,public-read-write,and authenticated-read.

Canonicalization:-
The process of converting data into a standard format that a service such as amazon s3 can recognize.

Capaity:-
The amount of available compute size at a given time .Each auto scaling group is defined with a minimum and maximum compute size. A Scaling activity increase or
decrease the capicity with in the defined minimum and maximum values .

Cartesian product:-
A mathematical operation that calculates a cartesian product.Also known as a cartesian data Processor.  

Cartesian Product Processor:-
A processor that calculates a cartesian product.Also known as a cartesian data proessor.

AWS CDK:-
AWS cloud development kit is an open-source software development framework for defining your cloud infrastructure in code and provisiong it through
aws cloud formation.

AWS Chatbot:-
AWS Chatbot is an interactive agent that makes it easier to monitor, troubleshoot, and operate AWS.resources in your slack channels and amazon chime chat rooms.

Amazon Chime:-
Amazon chime is a secure , real-time, unified communications service that transforms meeting by making them more efficient and easier to conduct.

CIDR block:-
Classless Inter-domain routing.An internet protocol address allocation and routr aggregation methodology.
 
Cipher text:- 
Information that has been encrypted, as opposed to plaintext, which is information that has not.

Classification:-
In machine learning a type of problem that seeks to place (classify) a data sample into a single category or class .Often,classification problems are modeled to 
choose one category out of two.These are binary classification problems.problems with more than two available are called multiclass classification problems.

classification:-
In machine learing a type of problem that seeks to place (classify) a datd sample into a single category or  class .often,classification problems are modeled to
choose one category out of two. these are binary classification problems.problems with more than two available are called multiclass classification problems.

Client VPN:-
AWS client VPN is A client-based , mangement vpn service that remote clients can use to securely access your AWS resources using an open vpn-based software client.

AWS cloud control Api:-
AWS cloud control API is a set of standardized application programming interfaces (APIs) that developers can use to create, read,update,delete and list supported
cloud infrastructure.


