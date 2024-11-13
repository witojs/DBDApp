package com.example.dbdapp

import com.example.dbdapp.model.Killer

object DummyData {
    val killerList = listOf(
        Killer(
            id = "1",
            name = "UNKNOWN",
            description = "If you hear a soft voice crying out for help in the woods, stay the hell away. The true nature of The Unknown remains a mystery, barring one fatal certainty: to cross its path is to risk an unknowable fate.",
            photo = R.drawable.unknown,
            power = "UVX (Unknown Venom X)",
            powerDescription = "Charge and launch a burst of UVX, which bounces once and creates a Blast Area upon impact. If they touch the Blast Area, they will become Weakened against your Power. If a Survivor is Weakened, they will lose a Health State whenever they touch a Blast Area. Survivors can lose the Weakened status by successfully looking at The Unknown for a brief duration."
        ),
        Killer(
            id = "2",
            name = "THE GOOD GUY - CHUCKY",
            description = "Viciously cruel with a cutting sense of humor, Chucky is a brutally effective killing machine. Using his diminutive frame to his advantage, he'll pop up when Survivors least expect it, chasing them down and introducing them to his trusty weapons.",
            photo = R.drawable.chucky,
            power = "PLAYTIME'S OVER",
            powerDescription = "The Good Guy is the first Killer in Dead by Daylight to feature a third-person camera. Special Ability - Hidey-Ho Mode: When Chucky enters Hidey-Ho Mode, he becomes Undetectable and generates Map-wide footfalls, disorienting Survivors. Though Hidey-Ho mode can be entered at any time, it does have a cooldown.  Special Ability - Scamper: While in Hidey-Ho Mode, Chucky can Scamper under a downed Pallet or through a Window, allowing him to quickly gain ground.  Special Ability - Slice & Dice: While in Hidey-Ho Mode, Chucky can sprint and lunge forward to Slice & Dice Survivors. This attack can be held, but Chucky will be unable to do anything else during this time. If a Survivor tries to Vault a Window or Pallet while you're charging a Slice & Dice attack, Chucky can quickly chain into a Scamper."
        ),
        Killer(
            id = "3",
            name = "THE XENOMORPH",
            description = "A perfect organism, born of violence, designed to kill, the Xenomorph is a relentless and cunning specimen. It stalks prey through subterranean tunnels, emerging without hesitation, striking with its razor-sharp tail, and eliminating prey one by one.",
            photo = R.drawable.xenomorph,
            power = "HIDDEN PURSUIT",
            powerDescription = "The Xenomorph can navigate a subterranean network of tunnels, allowing for rapid traversal across the Map and detecting nearby Survivor movement. Once inside, the Xenomorph can emerge at one of several Control Stations, covering great distances in a matter of seconds. If a Survivor is near a Control Station when the Xenomorph exits, their presence will be revealed through Killer Instinct.\nSpecial Ability: The Xenomorph can move on all fours, significantly reducing its Terror Radius and allowing for stealthier mobility. While in this state, the Xenomorph can strike Survivors with a Tail Attack that can hit through Windows, over dropped Pallets, and more.\nSpecial Item - Remote Flame Turret: When playing as the Xenomorph, Survivors will gain the ability to interact with Turrets. Turrets can be found at Control Stations and picked up and moved by Survivors. They can use Turrets to warn when you are nearby and place them at locations of their choosing. If you approach one, it will fire at you and temporarily disable your Power. Attack a Turret to destroy it."
        ),
        Killer(
            id = "4",
            name = "THE SINGULARITY",
            description = "A potential catalyst of humanity's extinction - or so it has been called - The Singularity is intelligent beyond measure and entirely void of morality. Its spread is inevitable, with the ability to materialize across the Map through a network of organic Biopods. Those that resist will only prolong their suffering.",
            photo = R.drawable.singularity,
            power = "QUANTUM INSTANTIATION",
            powerDescription = "The Singularity can shoot several Biopods onto surfaces around the Map. Once a Biopod has been attached, you can use it to locate and spy on Survivors. While surveying from a Biopod, The Singularity can tag Survivors in your line of sight, which applies the Slipstream effect.\nOnce a Survivor is Slipstreamed, The Singularity can materialize behind them and immediately begin chase. A Slipstreamed Survivor will spread the effect to other nearby Survivors.\nSpecial State: Overclock Mode: Upon Slipstreaming to a Survivor, The Singularity gains a temporary speed boost to breaking Pallets and Walls, damaging Generators, and Vaulting. During Overclock, you cannot use your Power, and you won't be stunned when hit by a Pallet. Instead, you'll become momentarily hindered and the Pallet will be destroyed.\nSpecial Interaction: Electromagnetic Pulse\nEMP Crates spawn across the Map when a Trial begins. Only Survivors can interact with these Crates. Over time, these Crates print EMPs, which can be picked up by Survivors. Survivors can fire the EMP to temporarily disable Biopods and remove Slipstream from other Survivors in range."
        ),
        Killer(
            id = "5",
            name = "THE SKULL MERCHANT",
            description = "A cunning and ruthless hunter, The Skull Merchant strives to be the ultimate apex predator. Using her gruesome Drones to track Survivors, she specializes in creating a deadly web of surveillance. Many have fallen prey to her dark innovations, their bones later repurposed into her next invention.",
            photo = R.drawable.skull_merchant,
            power = "EYES IN THE SKY",
            powerDescription = "The Skull Merchant can position several Drones around the Map. When a Drone is placed, it quickly enters Active Mode and casts a Detection Zone. While inside of this Detection Zone, you will be Undetectable.\nWhen a Survivor enters a Detection Zone, the Drone will gradually begin to Lock-On to them. When a Survivor reaches full Lock-On, their location will be revealed through Killer Instinct. They will also become Exposed.\nIf a Survivor is not detected for a while, the Drone will enter Scouting Mode. While in Scouting Mode, the Drone will slowly rotate to catch Survivors in its line of sight. Once a Survivor is detected, the Drone will return to Active Mode.\nSpecial Ability - Claw Trap: A Survivor can attempt to disable a Drone by Hacking it. If they succeed, they will receive a Claw Trap, which will reveal their location on your handheld Radar device. Should they fail, the Drone will immediately enter Active Mode and Lock-On to them, leaving them Exposed."
        ),
        Killer(
            id = "6",
            name = "THE KNIGHT",
            description = "A nightmare to behold with longsword in hand, many have fallen to The Knight's unyielding fury. His Guards - The Jailer, The Assassin, and The Carnifex - obey his commands with unwavering loyalty. Use them to patrol routes, deal with obstacles, and steer Survivors directly into your blade's path.",
            photo = R.drawable.the_knight,
            power = "GUARDIA COMPAGNIA",
            powerDescription = "Special Ability - Guard Patrol:\nThe Knight has 3 loyal Guards: The Jailer, The Assassin, and The Carnifex. Activate your Power to create a Patrol Path for one of your Guards to follow.\nWhile planning your Patrol Path, you can arrange for your Guard to engage in an action. Possible Actions include damaging a Generator and destroying a Pallet or Breakable Wall.\n\nGuard Special Ability - The Hunt:\nWhen a Guard detects a Survivor in or around his Patrol Path, The Hunt begins. The Guard will begin pursuit, leaving a Standard on the ground, and attempt to Injure or Down the Survivor.\nThe Survivor can end The Hunt early by grabbing the Standard, unhooking a Survivor, or outlasting The Guard.\nGuards will cycle one after the other in a consistent order, with each one having a different speciality. The Carnifex breaks and damage objects faster. The Assassin stays on the Hunt for the longest. The Jailer patrols longer and faster than the others."
        ),
        Killer(
            id = "7",
            name = "THE MASTERMIND",
            description = "A visionary as brilliant as he is ruthless, Albert Wesker's strategic mind is unrivalled. While some plans require intellect, others call for brute force. Rush forward to seize Survivors in your grasp and give them the gift of Uroboros - a necessary step on the path to evolution.",
            photo = R.drawable.mastermind,
            power = "VIRULENT BOUND",
            powerDescription = "Special Ability - Virulent Bound: Charge your Bound Attack to launch forward and strike. If your Bound collides with a Survivor, they will be briefly seized and Infected with Uroboros.\nFrom there, one of two situations will occur. The first: Wesker collides with a surface while holding a Survivor, and that Survivor becomes Injured. The second: Wesker collides with nothing and flings the Survivor forward - if they collide with a surface, they will become Injured.\nSpecial Effect - Uroboros Infection:\nWhen a Survivor is hit by the Virulent Bound, they are infected by the Uroboros, and Hindered when fully infected. If Wesker hits a fully Infected Survivor with a Bound Attack, they will be instantly carried."
        ),
        Killer(
            id = "8",
            name = "THE DREDGE",
            description = "A twisted abomination too disturbing to bear, The Dredge's malevolence is palpable. All light slowly drains in its presence, surrounding Survivors in darkness. Using lockers as map-wide gateways, it can emerge at any moment, seemingly everywhere at once.",
            photo = R.drawable.the_dredge,
            power = "REIGN OF DARKNESS",
            powerDescription = "Special Ability -The Gloaming: The Dredge can activate The Gloaming, leaving a Remnant behind. While The Gloaming is activated, The Dredge can teleport to any lockers across the map, allowing for heightened mobility and surprise attacks. Be warned - Survivors can barricade lockers to impede your progress. Otherwise, The Dredge can return to its Remnant.\nSpecial Ability - Nightfall:\nWhenever the Dredge teleports, places a Survivor on a Hook, or injures a Survivor, the Nightfall meter builds. The meter also fills when Survivors are injured, as well as when The Dredge remains in a Locker. When the meter is full, the entire map darkens. Simple navigation becomes a matter of life and death as Survivors scramble to stay one step ahead. Meanwhile, The Dredge loses its Terror Radius, gaining the element of surprise, as well as a reduced cooldown on Locker teleportation."
        ),
        Killer(
            id = "9",
            name = "THE ONRYŌ - SADAKO",
            description = "Capable of condemning Survivors to death through a powerful cursed videotape, Sadako's wrath is inevitable. Her presence conjures several televisions, through which she can teleport and emerge with malevolent purpose. The fleeting glimpse of her approach ensures that a chilling fate is not far behind.",
            photo = R.drawable.sadako,
            power = "DELUGE OF FEAR",
            powerDescription = "Begin a trial invisible to all Survivors, becoming intermittently visible when nearby. To attack, Manifest into Sadako's material form, becoming visible in the process. Sadako can also teleport to any TV positioned around the map, instantly Manifesting and giving any nearby Survivor 1 stack of Condemned. When a Survivor reaches 7 stacks of Condemned, they can be instantly killed when downed.\nSurvivors can prevent Sadako's mobility by powering down TVs, though they gain 1 stack of Condemned by doing so. Interacting with a specific TV can lower a Survivor's Condemned level by 4."
        ),
        Killer(
            id = "10",
            name = "THE ARTIST",
            description = "No matter the distance, The Artist and her murder of Dire Crows pose a constant threat to Survivors. Position up to three Crows and unleash them on a lethal trajectory, swarming and injuring anyone caught in their path. Use her Power to shut down key areas, predict and punish Survivor pathing, and gain valuable map-wide information.",
            photo = R.drawable.the_artist,
            power = "BIRDS OF TORMENT",
            powerDescription = "Summon up to 3 Dire Crows and propel them into flight. Flying Dire Crows will inflict damage for a short duration. After continuing beyond the established Flight Path, Dire Crows will no longer damage Survivors, but swarm them. If a swarmed Survivor is hit by a Dire Crow, they will receive damage."
        ),
        Killer(
            id = "11",
            name = "THE CENOBITE - PINHEAD",
            description = "The Cenobite, also known as Pinhead, specializes in inflicting map-wide suffering. Survivors must find the Lament Configuration lest a Chain Hunt begin, debilitating their movement with a relentless barrage of otherworldly shackles. The Cenobite can also summon a chain to bind Survivors, allowing him to gain ground and inflict punishment.",
            photo = R.drawable.pinhead,
            power = "SUMMONS OF PAIN",
            powerDescription = "Summon and control a Possessed Chain to bind a Survivor. Should the Chain connect, the Survivor will be unable to sprint as they're further slowed by additional Chains.\nPinhead also applies passive pressure. Survivors will see the aura of the Lament Configuration and must seek it out before a Chain Hunt begins. During a Chain Hunt, Survivors will be continuously barraged with Chains until the Lament Configuratrion is solved.\nWhen a Survivor does attempt to solve the Lament Configuration, Pinhead can teleport directly to its location. Should Pinhead find the Lament Configuration first, he can instantly activate a Chain Hunt."
        ),
        Killer(
            id = "12",
            name = "THE NEMESIS",
            description = "An unstoppable force relentless in his pursuit, nothing can stop The Nemesis from achieving his goal. His sweeping Tentacle infects Survivors with the T-Virus, further enhancing his destructive power in the process. Easily smash through pallets and breakable walls while two A.I-controlled Zombies patrol the map, applying additional pressure",
            photo = R.drawable.the_nemesis,
            power = "T-VIRUS",
            powerDescription = "Hitting Survivors with a Tentacle Strike Contaminates them and powers up your Mutation Rate meter. When Mutation Rate reaches Level 2, Tentacle Strike can instantly break pallets and breakable walls. At Level 3, Tentacle Strike gains a boost to range and movement speed while charging.\nThe Nemesis also spawns 2 A.I.-controlled Zombies that can Contaminate Survivors, pressure them off generators, and block key escape routes. If a Zombie attacks a Contaminated Survivor, they lose a health state."
        ),
        Killer(
            id = "13",
            name = "THE TRICKSTER",
            description = "Armed with an arsenal of throwing knives, The Trickster overwhelms fleeing Survivors with a relentless barrage of blades. Seemingly safe actions like vaulting windows and dropping Pallets turn into target practice for this twisted K-Pop Idol, whose stylish showmanship is rivalled only by his gleeful bloodlust.",
            photo = R.drawable.the_trickster,
            power = "SHOWSTOPPER",
            powerDescription = "Begin a Trial with 44 Blades. The Trickster throws a barrage of Blade, reloading his supply at lockers. A Survivor's Laceration Meter builds with each successful Blade hit, with 6 leading to the loss of a health state. The Survivor's Laceration Meter slowly decreases if they avoid being hit with a Blade. After several successful hits, The Trickster can use Main Event to unload an infinite number of Blades at high velocity."
        ),
        Killer(
            id = "14",
            name = "THE TWINS",
            description = "Charlotte Deshayes can unleash her conjoined twin brother Victor, falling dormant until he's finished hunting. Victor moves at high speeds and strikes with a pounce attack that debilitates and injures. Down Survivors with Victor and hook them with Charlotte, an oppressive tandem that can quickly disrupt even the best-laid plans.",
            photo = R.drawable.the_twins,
            power = "BLOOD BOND",
            powerDescription = "As Charlotte, unleash and take control of Victor. During this time, Charlotte falls dormant, losing her Terror Radius and Red Stain. Victor moves at high speed and can attack with a long-distance Pounce. When a successful Pounce hits a healthy Survivor, Victor latches onto them and must be forcefully removed, while control shifts back to Charlotte. Only Charlotte can hook downed Survivors."
        ),
        Killer(
            id = "15",
            name = "THE BLIGHT",
            description = "Capable of gaining ground on Survivors in mere moments, The Blight's lethal efficiency must never be underestimated. With the ability to bounce off surfaces and realign his trajectory, his relentless presence forces Survivors into snap decisions. The learning curve may feel steep, but mastering The Blight is a worthwhile pursuit.",
            photo = R.drawable.the_blight,
            power = "BLIGHTED CORRUPTION",
            powerDescription = "Use tokens to initiate a high-speed Rush, during which the Blight cannot attack. After colliding with a surface, The Blight can use another token to initiate a Lethal Rush that he can end with a quick attack. On any Rush other than the first, he can attack. The Blight can chain as many Rushes as he has tokens available, an ideal tool for applying pressure."
        ),
        Killer(
            id = "16",
            name = "THE EXECUTIONER - PYRAMID HEAD",
            description = "Merciless and unforgiving, The Executioner brings his own form of twisted justice to The Fog, tormenting Survivors with hazards around the map. Hooks are an effective tool, but nothing punishes quite like a Cage of Torment. All hope will swiftly fade the moment Pyramid Head raises his mighty blade to deliver the Final Judgment.",
            photo = R.drawable.pyramid_head,
            power = "RITES OF JUDGEMENT",
            powerDescription = "Carve a trail into the ground, inflicting Torment on any Survivor that crosses it. Pyramid Head can also fire a ranged attack - the Punishment of the Damned - while Rites of Judgment is active."
        ),
        Killer(
            id = "17",
            name = "THE DEATHSLINGER",
            description = "Upon catching prey unaware, the Deathslinger uses his handmade gun - The Redeemer - to skewer fleeing Survivors with a long-distance harpoon. Accurate aim, patient tracking, and sharp predictions are crucial to landing successful shots, but the reward of a Survivor's scream as they're reeled in will never sound so sweet.",
            photo = R.drawable.the_deathslinger,
            power = "THE REDEEMER",
            powerDescription = "Raise The Redeemer, track a Survivor in your sights, and fire a chained harpoon. If the shot connects, reel in the struggling Survivor for an attack. If the Survivor manages to break free from the chain, the Survivor will escape and the Deathslinger will be stunned for a brief duration."
        ),
        Killer(
            id = "18",
            name = "THE ONI",
            description = "Redefine wrath with The Oni, a truly formidable force. Injured Survivors leave a trail of Blood Orbs, fuelling The Oni's rage and sending him into a state of fury. Upon unleashing a bloodcurdling roar, The Oni gains the ability to charge with vengeful purpose, instantly cutting down anyone in his way.",
            photo = R.drawable.the_oni,
            power = "YAMAOKA'S WRATH",
            powerDescription = "Absorb Blood Orbs left by injured Survivors to build Yamaoka's Wrath. When fully charged, unleash Blood Fury to charge at breakneck speed with Demon Dash and strike down Survivors with a powerful one-hit blow."
        ),
        Killer(
            id = "19",
            name = "THE DEMOGORGON",
            description = "There's no reasoning with The Demogorgon, a vicious predator from the depths of The Upside Down. Capable of traversing the Map through a series of Portals, it chases down prey with ferocious intensity, finishing them off with a ferocious lunging strike.",
            photo = R.drawable.the_demogorgon,
            power = "OF THE ABYSS",
            powerDescription = "Press the Power button to charge and activate Of The Abyss. During this time, Survivors near an Activated Portal will be revealed through Killer Instinct.\nSpecial Ability: Shred: While charging or holding Of The Abyss, press the Attack button to unleash a lunging attack. If you use this on a Pallet or Breakable Wall, it will be destroyed.\nSpecial Ability: Portals: The Demogorgon can traverse between Portals, granting it map-wide mobility. Press the Active Ability button to place an inactive Portal on the ground. Stand on a Portal and highlight the Portal you wish to emerge from. After, press the Active Ability to travel through The Upside Down and emerge from the highlighted Portal, briefly becoming Undetectable for a duration.\nPortals become Activated the first time you traverse through them. When a Survivor walks over or attempts to seal an Activated Portal, they become Oblivious."
        ),
        Killer(
            id = "20",
            name = "THE GHOST FACE",
            description = "A stealth-focused Killer capable of approaching unseen, The Ghost Face is adept at stalking his prey. Keep tabs on each individual Survivor, patiently marking them for death - provided you can remain hidden. Lie in wait until the perfect time to strike, and down Survivors before they know what hit them.",
            photo = R.drawable.the_ghostface,
            power = "NIGHT SHROUD",
            powerDescription = "Become Undetectable, losing both Terror Radius and Red Stain. In this state, stalk individual Survivors to Mark them, leaving them Exposed and vulnerable to a one-hit down. Time your stalking process strategically to attack Survivors at opportune moments. A word of warning - Survivors can break the Night Shroud by catching extended sight of The Ghost Face."
        ),
        Killer(
            id = "21",
            name = "THE PLAGUE",
            description = "Traditional healing methods are ineffective against The Plague's vile Purge, which can infect generators and Survivors. Pools of Devotion are the only respite from the spreading pestilence. The more Survivors heal, the stronger The Plague's power becomes, transforming her Purge into a sickening projectile of pain.",
            photo = R.drawable.the_plague,
            power = "VILE PURGE",
            powerDescription = "Use a stream of Vile Purge to infect surfaces, objects, and Survivors. Survivors infected by Vile Purge will eventually become injured, incapable of healing until cleansing their sickness at a Pool of Devotion. When The Plague drinks from a Pool that has been corrupted, her Vile Purge transforms into Corrupt Purge, a stream of damaging bile that can instantly injure and down Survivors."
        ),
        Killer(
            id = "22",
            name = "THE LEGION",
            description = "The Legion are a close-knit group of murderous Killers, linked by the desire to dole out pain in equal measure. Keep the injuries coming with Feral Frenzy, a high-intensity sprint that can set off a devastating chain reaction. Survivors will be constantly tending to their wounds, leaving them vulnerable to be picked off one by one.",
            photo = R.drawable.the_legion,
            power = "FERAL FRENZY",
            powerDescription = "Enter a sprint and chain attacks to hit multiple Survivors. Upon hitting a Survivor in Feral Frenzy, your power gauge will be replenished, and the location of all Survivors within your Terror Radius will be revealed. While using Feral Frenzy, The Legion can vault over windows and pallets. Missing an attack, getting stunned, or running out of power will end Feral Frenzy."
        ),
        Killer(
            id = "23",
            name = "THE SPIRIT",
            description = "While using her Yamaoka's Haunting Power, both The Spirit and Survivors cannot be seen by one another. Instead, Survivors are revealed by their Scratch Marks, breathing, and interactions with the environment. Each chase becomes a battle of wits, a duel where only the sharpest mind-games prevail.",
            photo = R.drawable.the_spirit,
            power = "YAMAOKA'S HAUNTING",
            powerDescription = "Yamaoka's Haunting activates a Phase Walk, during which both The Spirit and Survivors become invisible to one another. While Phasing, The Spirit moves at heightened speeds, tracking Survivors through their scratch marks and various audio cues. Survivors won't know what hit them."
        ),
        Killer(
            id = "24",
            name = "THE CLOWN",
            description = "Using his Afterpiece concoctions, The Clown can steer Survivors into dangerous areas and shorten chases. His purple bottle emits a cloud of noxious gas that disorients, slows down, and hinders Survivors. Throwing the yellow bottle requires foresight, as anyone who passes through the gas experiences a speed burst.",
            photo = R.drawable.the_clown,
            power = "THE AFTERPIECE TONIC",
            powerDescription = "Begin a Trial armed with 5 bottles of the Clown's poisonous concoctions. The purple Afterpiece Tonic can be thrown to disorient, direct, and hinder Survivors, whose coughing fits make them easier to track. The Yellow Afterpiece Antidote grants a burst of speed that closes distance with deadly efficacy. The Clown can refill his bottles when needed."
        ),
        Killer(
            id = "25",
            name = "THE PIG - AMANDA YOUNG",
            description = "Creep up and ambush Survivors with The Pig, the stealthy successor to the legendary Jigsaw. But simply hooking them isn't enough. Survivors can first be punished with a Reverse Bear Trap, which they must race to remove at Jigsaw Boxes across the map. Suddenly, repairing generators isn't quite so pressing...",
            photo = R.drawable.the_pig,
            power = "JIGSAW'S BAPTISM",
            powerDescription = "Begin a trial with 4 Reverse Bear Traps, which can be placed on downed Survivors. Once a generator is completed, a Death timer begins. Survivors must attempt to escape the Trap at one of the Jigsaw Boxes around the map. The Pig can also crouch, moving at reduced speed with no Red Stain or Terror Radius. While crouching, she can attack with an Ambush Dash, quickly covering a great distance with a chilling roar."
        ),
        Killer(
            id = "26",
            name = "THE NIGHTMARE - FREDDY KRUEGER",
            description = "Over time, The Nightmare forces Survivors into the Dream World. Once inside, Survivors will quickly realize the absence of a Terror Radius. With the ability to slow Survivors with Dream Snares, deceive with fake Dream Pallets, and pressure the map by teleporting directly to generators, The Nightmare lives up to his name.",
            photo = R.drawable.the_nightmare,
            power = "DREAM DEMON",
            powerDescription = "The Nightmare spends each trial in the Dream World and can send Survivors to the Dream World with an attack. Use Dream Projection to teleport to an unfinished generator, allowing for oppressive map control. Use Dream Snares to slow sleeping Survivors down in a chase, or Dream Pallets to lure them into unsafe areas. To escape the Dream World, Survivors must find an Alarm Clock and wake up."
        ),
        Killer(
            id = "27",
            name = "THE CANNIBAL - LEATHERFACE",
            description = "Leatherface knows a thing or two about chainsaw massacres. Any Survivor in his path will be instantly cut down, and his presence alone is enough to instill sheer panic. Capable of hitting multiple targets with a single swing, Leatherface is an unstoppable force with an insatiable appetite.",
            photo = R.drawable.leatherface,
            power = "BUBBA'S CHAINSAW",
            powerDescription = "Charge your Chainsaw and unleash a devastating sweep attack, instantly downing any Survivor caught in your path. The Chainsaw can use up to 3 charges for an extended sweep, recharging whenever it's not in use."
        ),
        Killer(
            id = "28",
            name = "THE DOCTOR",
            description = "Even the simplest tasks become exceedingly difficult in the clutches of madness. The Doctor's disturbing methods drive Survivors deep into insanity, filling the air with their deranged screams and revealing their locations. Nothing stops a window vault in its tracks like a healthy dose of Shock Therapy.",
            photo = R.drawable.the_doctor,
            power = "CARTER'S SPARK",
            powerDescription = "Drive Survivors into Madness with Shock Therapy and Static Blast. Each Madness Tier further debilitates Survivors with a variety of afflictions, and those in Tier III are forced to snap out of it before they can repair, heal, sabotage, search, or cleanse Totems. A well-timed Shock Therapy use prevents Survivors from vaulting and dropping pallets."
        ),
        Killer(
            id = "29",
            name = "THE HAG",
            description = "The Hag specializes in creating a dangerous web of Phantasm Traps, to be triggered by unsuspecting Survivors. She can instantly teleport to a triggered Trap, striking the Survivor that sprung it. Lock down key areas, make rescues a deadly gamble, and end chases quickly with strategic Phantasm Trap placement.",
            photo = R.drawable.the_hag,
            power = "BLACKENED CATALYST",
            powerDescription = "The Hag bends and shapes mud to her will. Place up to 10 Phantasm Traps. Survivors who enter a Phantasm Trap's range will trigger a Mud Phantasm, to which The Hag can instantly teleport. In addition to startling Survivors, Mud Phantasms emit a fake Terror Radius to further disorient them."
        ),
        Killer(
            id = "30",
            name = "THE SHAPE - MICHAEL MYERS",
            description = "The Shape lurks in the distance, patiently biding his time. His evil builds while stalking Survivors, fueling him with malevolent power. As the trial progresses, The Shape evolves from a quiet menace to an unstoppable juggernaut capable of shredding through even the most resilient teams.",
            photo = R.drawable.the_shape,
            power = "EVIL WITHIN",
            powerDescription = "The Shape has three tiers of Evil Within, built by stalking Survivors. In Tier 1, The Shape has no Terror Radius and a reduced speed and lunge. In Tier 2, he has a reduced Terror Radius, returning to his normal speed and lunge. In Tier 3, he can instantly down Survivors with a lethal increased lunge for an extended duration before returning to Tier 2."
        ),
        Killer(
            id = "31",
            name = "THE HUNTRESS",
            description = "Armed with throwable hatchets, The Huntress is a constant threat to Survivors, even those at a great distance. With patience and precision, chases can end as quickly as they begin. Predict Survivor movement and let your hatchet fly - there's nothing quite like the rewarding sound of a target struck.",
            photo = R.drawable.the_huntress,
            power = "HUNTING HATCHETS",
            powerDescription = "Begin the trial with 5 Hunting Hatchets, which can be wound up and thrown with deadly precision. Hatchets can be refilled at lockers."
        ),
        Killer(
            id = "32",
            name = "THE NURSE",
            description = "Using her Blink ability, The Nurse can teleport great distances in moments, predicting and cutting off Survivor routes. A powerful process best honed by experience, careless Blinks are punished with a wave of fatigue. The epitome of high risk, high reward, The Nurse can end chases with surgical precision.",
            photo = R.drawable.the_nurse,
            power = "SPENCER'S LAST BREATH",
            powerDescription = "Charge a Blink to teleport a great distance, quickly gaining the ability to charge a second Blink. Once all charged Blinks are expended, The Nurse may elect to attack before she is briefly struck with fatigue."
        ),
        Killer(
            id = "33",
            name = "THE HILLBILLY",
            description = "The sound of a revving motor, followed by a bloodthirsty scream of rage. The Hillbilly isn't exactly subtle, but he makes up for it in brutal efficiency. Capable of traversing great distances at a rapid pace, those in his path will be rudely introduced to one-hundred gnashing chainsaw blades.",
            photo = R.drawable.the_hillbilly,
            power = "THE CHAINSAW",
            powerDescription = "Rev the Chainsaw to begin a Chainsaw Sprint and travel great distances at blistering speed. Hit a Survivor with the Chainsaw Sprint for an instant down, but be careful -- careless revving will cause the Chainsaw to overheat."
        ),
        Killer(
            id = "34",
            name = "THE WRAITH",
            description = "Using his Wailing Bell to render himself invisible, The Wraith tracks his prey and strikes with little warning. Upon hearing the Bell's fateful chime, Survivors must think fast or suffer the consequences. A hit-and-run specialist, The Wraith is adept at keeping everybody injured.",
            photo = R.drawable.the_wraith,
            power = "WAILING BELL",
            powerDescription = "Ring the Wailing Bell to cloak, becoming invisible and losing the Terror Radius. Though The Wraith cannot attack while invisible, uncloaking grants a deadly lunge capable of injuring unsuspecting Survivors. Remember - The Wraith becomes slightly easier to spot at close distance, and his Wailing Bell rings out loudly while uncloaking and cloaking."
        ),
        Killer(
            id = "35",
            name = "THE TRAPPER",
            description = "Armed with a bag of Bear Traps, The Trapper specializes in catching unsuspecting Survivors. By placing traps in high-traffic areas and thick patches of grass, he creates a deadly area that forces Survivors to move with caution. When dealing with The Trapper, a simple misstep can prove fatal.",
            photo = R.drawable.the_trapper,
            power = "BEAR TRAP",
            powerDescription = "Begin a trial with 2 Bear Traps, with 6 additional Bear Traps randomly spawning throughout the map. The Trapper can only carry 2 Bear Traps at a time. Survivors can be caught in a Bear Trap and attempt to escape or be freed by a teammate. If a Survivor is healthy, being caught in a Bear Trap will put them in the injured state."
        ),
    )
}