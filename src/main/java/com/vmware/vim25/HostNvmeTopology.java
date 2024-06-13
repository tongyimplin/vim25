package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeTopology;
import com.vmware.vim25.HostNvmeTopologyInterface;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeTopology", propOrder = {"adapter"})
public class HostNvmeTopology extends DynamicData {
  protected List<HostNvmeTopologyInterface> adapter;
  
  public List<HostNvmeTopologyInterface> getAdapter() {
    if (this.adapter == null)
      this.adapter = new ArrayList<>(); 
    return this.adapter;
  }
}
