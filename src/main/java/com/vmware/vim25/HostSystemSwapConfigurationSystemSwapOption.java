package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSystemSwapConfigurationDatastoreOption;
import com.vmware.vim25.HostSystemSwapConfigurationDisabledOption;
import com.vmware.vim25.HostSystemSwapConfigurationHostCacheOption;
import com.vmware.vim25.HostSystemSwapConfigurationHostLocalSwapOption;
import com.vmware.vim25.HostSystemSwapConfigurationSystemSwapOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemSwapConfigurationSystemSwapOption", propOrder = {"key"})
@XmlSeeAlso({HostSystemSwapConfigurationHostLocalSwapOption.class, HostSystemSwapConfigurationDisabledOption.class, HostSystemSwapConfigurationDatastoreOption.class, HostSystemSwapConfigurationHostCacheOption.class})
public class HostSystemSwapConfigurationSystemSwapOption extends DynamicData {
  protected int key;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
}
