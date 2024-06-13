package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualEnsoniq1371;
import com.vmware.vim25.VirtualHdAudioCard;
import com.vmware.vim25.VirtualSoundBlaster16;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSoundCard")
@XmlSeeAlso({VirtualSoundBlaster16.class, VirtualEnsoniq1371.class, VirtualHdAudioCard.class})
public class VirtualSoundCard extends VirtualDevice {}
