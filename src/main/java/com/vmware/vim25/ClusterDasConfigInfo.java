package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlPolicy;
import com.vmware.vim25.ClusterDasConfigInfo;
import com.vmware.vim25.ClusterDasVmSettings;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasConfigInfo", propOrder = {"enabled", "vmMonitoring", "hostMonitoring", "vmComponentProtecting", "failoverLevel", "admissionControlPolicy", "admissionControlEnabled", "defaultVmSettings", "option", "heartbeatDatastore", "hbDatastoreCandidatePolicy"})
public class ClusterDasConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  protected String vmMonitoring;
  
  protected String hostMonitoring;
  
  protected String vmComponentProtecting;
  
  protected Integer failoverLevel;
  
  protected ClusterDasAdmissionControlPolicy admissionControlPolicy;
  
  protected Boolean admissionControlEnabled;
  
  protected ClusterDasVmSettings defaultVmSettings;
  
  protected List<OptionValue> option;
  
  protected List<ManagedObjectReference> heartbeatDatastore;
  
  @XmlElement(name = "hBDatastoreCandidatePolicy")
  protected String hbDatastoreCandidatePolicy;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public String getVmMonitoring() {
    return this.vmMonitoring;
  }
  
  public void setVmMonitoring(String paramString) {
    this.vmMonitoring = paramString;
  }
  
  public String getHostMonitoring() {
    return this.hostMonitoring;
  }
  
  public void setHostMonitoring(String paramString) {
    this.hostMonitoring = paramString;
  }
  
  public String getVmComponentProtecting() {
    return this.vmComponentProtecting;
  }
  
  public void setVmComponentProtecting(String paramString) {
    this.vmComponentProtecting = paramString;
  }
  
  public Integer getFailoverLevel() {
    return this.failoverLevel;
  }
  
  public void setFailoverLevel(Integer paramInteger) {
    this.failoverLevel = paramInteger;
  }
  
  public ClusterDasAdmissionControlPolicy getAdmissionControlPolicy() {
    return this.admissionControlPolicy;
  }
  
  public void setAdmissionControlPolicy(ClusterDasAdmissionControlPolicy paramClusterDasAdmissionControlPolicy) {
    this.admissionControlPolicy = paramClusterDasAdmissionControlPolicy;
  }
  
  public Boolean isAdmissionControlEnabled() {
    return this.admissionControlEnabled;
  }
  
  public void setAdmissionControlEnabled(Boolean paramBoolean) {
    this.admissionControlEnabled = paramBoolean;
  }
  
  public ClusterDasVmSettings getDefaultVmSettings() {
    return this.defaultVmSettings;
  }
  
  public void setDefaultVmSettings(ClusterDasVmSettings paramClusterDasVmSettings) {
    this.defaultVmSettings = paramClusterDasVmSettings;
  }
  
  public List<OptionValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
  
  public List<ManagedObjectReference> getHeartbeatDatastore() {
    if (this.heartbeatDatastore == null)
      this.heartbeatDatastore = new ArrayList<>(); 
    return this.heartbeatDatastore;
  }
  
  public String getHBDatastoreCandidatePolicy() {
    return this.hbDatastoreCandidatePolicy;
  }
  
  public void setHBDatastoreCandidatePolicy(String paramString) {
    this.hbDatastoreCandidatePolicy = paramString;
  }
}
