package com.vmware.vim25;

import com.vmware.vim25.ClusterGroupInfo;
import com.vmware.vim25.ClusterHostGroup;
import com.vmware.vim25.ClusterVmGroup;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterGroupInfo", propOrder = {"name", "userCreated", "uniqueID"})
@XmlSeeAlso({ClusterHostGroup.class, ClusterVmGroup.class})
public class ClusterGroupInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected Boolean userCreated;
  
  protected String uniqueID;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Boolean isUserCreated() {
    return this.userCreated;
  }
  
  public void setUserCreated(Boolean paramBoolean) {
    this.userCreated = paramBoolean;
  }
  
  public String getUniqueID() {
    return this.uniqueID;
  }
  
  public void setUniqueID(String paramString) {
    this.uniqueID = paramString;
  }
}
