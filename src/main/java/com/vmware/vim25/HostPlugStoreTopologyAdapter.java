package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlugStoreTopologyAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlugStoreTopologyAdapter", propOrder = {"key", "adapter", "path"})
public class HostPlugStoreTopologyAdapter extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String adapter;
  
  protected List<String> path;
  
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
  
  public List<String> getPath() {
    if (this.path == null)
      this.path = new ArrayList<>(); 
    return this.path;
  }
}
