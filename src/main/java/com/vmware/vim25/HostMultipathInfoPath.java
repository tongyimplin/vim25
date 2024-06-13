package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMultipathInfoPath;
import com.vmware.vim25.HostTargetTransport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoPath", propOrder = {"key", "name", "pathState", "state", "isWorkingPath", "adapter", "lun", "transport"})
public class HostMultipathInfoPath extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String pathState;
  
  protected String state;
  
  protected Boolean isWorkingPath;
  
  @XmlElement(required = true)
  protected String adapter;
  
  @XmlElement(required = true)
  protected String lun;
  
  protected HostTargetTransport transport;
  
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
  
  public String getPathState() {
    return this.pathState;
  }
  
  public void setPathState(String paramString) {
    this.pathState = paramString;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public Boolean isIsWorkingPath() {
    return this.isWorkingPath;
  }
  
  public void setIsWorkingPath(Boolean paramBoolean) {
    this.isWorkingPath = paramBoolean;
  }
  
  public String getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(String paramString) {
    this.adapter = paramString;
  }
  
  public String getLun() {
    return this.lun;
  }
  
  public void setLun(String paramString) {
    this.lun = paramString;
  }
  
  public HostTargetTransport getTransport() {
    return this.transport;
  }
  
  public void setTransport(HostTargetTransport paramHostTargetTransport) {
    this.transport = paramHostTargetTransport;
  }
}
