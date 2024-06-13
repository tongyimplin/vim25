package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.OvfConsumerOstNode;
import com.vmware.vim25.OvfDeploymentOption;
import com.vmware.vim25.OvfNetworkInfo;
import com.vmware.vim25.OvfParseDescriptorResult;
import com.vmware.vim25.VAppProductInfo;
import com.vmware.vim25.VAppPropertyInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfParseDescriptorResult", propOrder = {"eula", "network", "ipAllocationScheme", "ipProtocols", "property", "productInfo", "annotation", "approximateDownloadSize", "approximateFlatDeploymentSize", "approximateSparseDeploymentSize", "defaultEntityName", "virtualApp", "deploymentOption", "defaultDeploymentOption", "entityName", "annotatedOst", "error", "warning"})
public class OvfParseDescriptorResult extends DynamicData {
  protected List<String> eula;
  
  protected List<OvfNetworkInfo> network;
  
  protected List<String> ipAllocationScheme;
  
  protected List<String> ipProtocols;
  
  protected List<VAppPropertyInfo> property;
  
  protected VAppProductInfo productInfo;
  
  @XmlElement(required = true)
  protected String annotation;
  
  protected Long approximateDownloadSize;
  
  protected Long approximateFlatDeploymentSize;
  
  protected Long approximateSparseDeploymentSize;
  
  @XmlElement(required = true)
  protected String defaultEntityName;
  
  protected boolean virtualApp;
  
  protected List<OvfDeploymentOption> deploymentOption;
  
  @XmlElement(required = true)
  protected String defaultDeploymentOption;
  
  protected List<KeyValue> entityName;
  
  protected OvfConsumerOstNode annotatedOst;
  
  protected List<LocalizedMethodFault> error;
  
  protected List<LocalizedMethodFault> warning;
  
  public List<String> getEula() {
    if (this.eula == null)
      this.eula = new ArrayList<>(); 
    return this.eula;
  }
  
  public List<OvfNetworkInfo> getNetwork() {
    if (this.network == null)
      this.network = new ArrayList<>(); 
    return this.network;
  }
  
  public List<String> getIpAllocationScheme() {
    if (this.ipAllocationScheme == null)
      this.ipAllocationScheme = new ArrayList<>(); 
    return this.ipAllocationScheme;
  }
  
  public List<String> getIpProtocols() {
    if (this.ipProtocols == null)
      this.ipProtocols = new ArrayList<>(); 
    return this.ipProtocols;
  }
  
  public List<VAppPropertyInfo> getProperty() {
    if (this.property == null)
      this.property = new ArrayList<>(); 
    return this.property;
  }
  
  public VAppProductInfo getProductInfo() {
    return this.productInfo;
  }
  
  public void setProductInfo(VAppProductInfo paramVAppProductInfo) {
    this.productInfo = paramVAppProductInfo;
  }
  
  public String getAnnotation() {
    return this.annotation;
  }
  
  public void setAnnotation(String paramString) {
    this.annotation = paramString;
  }
  
  public Long getApproximateDownloadSize() {
    return this.approximateDownloadSize;
  }
  
  public void setApproximateDownloadSize(Long paramLong) {
    this.approximateDownloadSize = paramLong;
  }
  
  public Long getApproximateFlatDeploymentSize() {
    return this.approximateFlatDeploymentSize;
  }
  
  public void setApproximateFlatDeploymentSize(Long paramLong) {
    this.approximateFlatDeploymentSize = paramLong;
  }
  
  public Long getApproximateSparseDeploymentSize() {
    return this.approximateSparseDeploymentSize;
  }
  
  public void setApproximateSparseDeploymentSize(Long paramLong) {
    this.approximateSparseDeploymentSize = paramLong;
  }
  
  public String getDefaultEntityName() {
    return this.defaultEntityName;
  }
  
  public void setDefaultEntityName(String paramString) {
    this.defaultEntityName = paramString;
  }
  
  public boolean isVirtualApp() {
    return this.virtualApp;
  }
  
  public void setVirtualApp(boolean paramBoolean) {
    this.virtualApp = paramBoolean;
  }
  
  public List<OvfDeploymentOption> getDeploymentOption() {
    if (this.deploymentOption == null)
      this.deploymentOption = new ArrayList<>(); 
    return this.deploymentOption;
  }
  
  public String getDefaultDeploymentOption() {
    return this.defaultDeploymentOption;
  }
  
  public void setDefaultDeploymentOption(String paramString) {
    this.defaultDeploymentOption = paramString;
  }
  
  public List<KeyValue> getEntityName() {
    if (this.entityName == null)
      this.entityName = new ArrayList<>(); 
    return this.entityName;
  }
  
  public OvfConsumerOstNode getAnnotatedOst() {
    return this.annotatedOst;
  }
  
  public void setAnnotatedOst(OvfConsumerOstNode paramOvfConsumerOstNode) {
    this.annotatedOst = paramOvfConsumerOstNode;
  }
  
  public List<LocalizedMethodFault> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
  
  public List<LocalizedMethodFault> getWarning() {
    if (this.warning == null)
      this.warning = new ArrayList<>(); 
    return this.warning;
  }
}
