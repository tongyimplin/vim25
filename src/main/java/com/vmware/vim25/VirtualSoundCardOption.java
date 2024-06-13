package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualEnsoniq1371Option;
import com.vmware.vim25.VirtualHdAudioCardOption;
import com.vmware.vim25.VirtualSoundBlaster16Option;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSoundCardOption")
@XmlSeeAlso({VirtualEnsoniq1371Option.class, VirtualSoundBlaster16Option.class, VirtualHdAudioCardOption.class})
public class VirtualSoundCardOption extends VirtualDeviceOption {}
