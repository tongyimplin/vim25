package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpStackInfo;
import com.vmware.vim25.NetIpStackInfoDefaultRouter;
import com.vmware.vim25.NetIpStackInfoNetToMedia;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpStackInfo", propOrder = {"neighbor", "defaultRouter"})
public class NetIpStackInfo extends DynamicData {
  protected List<NetIpStackInfoNetToMedia> neighbor;
  
  protected List<NetIpStackInfoDefaultRouter> defaultRouter;
  
  public List<NetIpStackInfoNetToMedia> getNeighbor() {
    if (this.neighbor == null)
      this.neighbor = new ArrayList<>(); 
    return this.neighbor;
  }
  
  public List<NetIpStackInfoDefaultRouter> getDefaultRouter() {
    if (this.defaultRouter == null)
      this.defaultRouter = new ArrayList<>(); 
    return this.defaultRouter;
  }
}
