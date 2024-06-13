package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EnvironmentBrowserConfigOptionQuerySpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentBrowserConfigOptionQuerySpec", propOrder = {"key", "host", "guestId"})
public class EnvironmentBrowserConfigOptionQuerySpec extends DynamicData {
  protected String key;
  
  protected ManagedObjectReference host;
  
  protected List<String> guestId;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<String> getGuestId() {
    if (this.guestId == null)
      this.guestId = new ArrayList<>(); 
    return this.guestId;
  }
}
