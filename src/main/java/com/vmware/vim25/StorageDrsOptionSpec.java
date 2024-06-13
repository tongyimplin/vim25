package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.OptionValue;
import com.vmware.vim25.StorageDrsOptionSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsOptionSpec", propOrder = {"option"})
public class StorageDrsOptionSpec extends ArrayUpdateSpec {
  protected OptionValue option;
  
  public OptionValue getOption() {
    return this.option;
  }
  
  public void setOption(OptionValue paramOptionValue) {
    this.option = paramOptionValue;
  }
}
