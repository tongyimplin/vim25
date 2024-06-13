package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSystemSwapConfiguration;
import com.vmware.vim25.HostSystemSwapConfigurationSystemSwapOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemSwapConfiguration", propOrder = {"option"})
public class HostSystemSwapConfiguration extends DynamicData {
  protected List<HostSystemSwapConfigurationSystemSwapOption> option;
  
  public List<HostSystemSwapConfigurationSystemSwapOption> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
