package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiTopology;
import com.vmware.vim25.HostScsiTopologyInterface;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiTopology", propOrder = {"adapter"})
public class HostScsiTopology extends DynamicData {
  protected List<HostScsiTopologyInterface> adapter;
  
  public List<HostScsiTopologyInterface> getAdapter() {
    if (this.adapter == null)
      this.adapter = new ArrayList<>(); 
    return this.adapter;
  }
}
