package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeController;
import com.vmware.vim25.HostNvmeTopologyInterface;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeTopologyInterface", propOrder = {"key", "adapter", "connectedController"})
public class HostNvmeTopologyInterface extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String adapter;
  
  protected List<HostNvmeController> connectedController;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(String paramString) {
    this.adapter = paramString;
  }
  
  public List<HostNvmeController> getConnectedController() {
    if (this.connectedController == null)
      this.connectedController = new ArrayList<>(); 
    return this.connectedController;
  }
}
