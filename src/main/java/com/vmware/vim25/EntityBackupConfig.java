package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EntityBackupConfig;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityBackupConfig", propOrder = {"entityType", "configBlob", "key", "name", "container", "configVersion"})
public class EntityBackupConfig extends DynamicData {
  @XmlElement(required = true)
  protected String entityType;
  
  @XmlElement(required = true)
  protected byte[] configBlob;
  
  protected String key;
  
  protected String name;
  
  protected ManagedObjectReference container;
  
  protected String configVersion;
  
  public String getEntityType() {
    return this.entityType;
  }
  
  public void setEntityType(String paramString) {
    this.entityType = paramString;
  }
  
  public byte[] getConfigBlob() {
    return this.configBlob;
  }
  
  public void setConfigBlob(byte[] paramArrayOfbyte) {
    this.configBlob = paramArrayOfbyte;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedObjectReference getContainer() {
    return this.container;
  }
  
  public void setContainer(ManagedObjectReference paramManagedObjectReference) {
    this.container = paramManagedObjectReference;
  }
  
  public String getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(String paramString) {
    this.configVersion = paramString;
  }
}
