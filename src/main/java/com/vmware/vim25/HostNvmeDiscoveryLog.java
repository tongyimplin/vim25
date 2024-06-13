package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeDiscoveryLog;
import com.vmware.vim25.HostNvmeDiscoveryLogEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDiscoveryLog", propOrder = {"entry", "complete"})
public class HostNvmeDiscoveryLog extends DynamicData {
  protected List<HostNvmeDiscoveryLogEntry> entry;
  
  protected boolean complete;
  
  public List<HostNvmeDiscoveryLogEntry> getEntry() {
    if (this.entry == null)
      this.entry = new ArrayList<>(); 
    return this.entry;
  }
  
  public boolean isComplete() {
    return this.complete;
  }
  
  public void setComplete(boolean paramBoolean) {
    this.complete = paramBoolean;
  }
}
