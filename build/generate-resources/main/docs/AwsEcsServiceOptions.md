

# AwsEcsServiceOptions

Options for running a Task as a service in AWS ECS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loadBalancers** | [**List&lt;AwsEcsServiceLoadBalancerDetails&gt;**](AwsEcsServiceLoadBalancerDetails.md) |  |  [readonly]
**healthCheckGracePeriodSeconds** | **Integer** |  |  [optional]
**forceNewDeployment** | **Boolean** |  |  [optional]
**deployMinimumHealthyPercent** | **Integer** |  |  [optional]
**deployMaximumPercent** | **Integer** |  |  [optional]
**deployEnableCircuitBreaker** | **Boolean** |  |  [optional]
**deployRollbackOnFailure** | **Boolean** |  |  [optional]
**enableEcsManagedTags** | **Boolean** |  |  [optional]
**propagateTags** | **PropagateTagsEnum** |  |  [optional]
**tags** | **Map&lt;String, String&gt;** |  |  [optional]



