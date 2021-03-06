{

  "general": {

    "userAgentAdd": "gonative",

    "useWKWebView": true,

    "enableWindowOpen": true,

    "useCrosswalkWebView": false,

    "forceScreenOrientation": null,

    "initialUrl": "https://www.pcepurnia.org/",

    "appName": "Purnea College Of Engineering"

  },

  "navigation": {

    "androidPullToRefresh": false,

    "iosPullToRefresh": true,

    "androidShowRefreshButton": false,

    "iosShowRefreshButton": false,

    "deepLinkDomains": [],

    "tabNavigation": {

      "tabSelectionConfig": [

        {

          "id": "1",

          "regex": ""

        }

      ],

      "tabMenus": [

        {

          "id": "1",

          "items": [

            {}

          ]

        }

      ]

    },

    "sidebarNavigation": {

      "menus": [

        {

          "name": "default",

          "items": null,

          "active": false

        },

        {

          "name": "loggedIn",

          "items": null,

          "active": false

        }

      ],

      "menuSelectionConfig": {

        "testURL": null,

        "redirectLocations": [

          {

            "regex": null,

            "menuName": "default",

            "loggedIn": false

          },

          {

            "regex": ".*",

            "menuName": "default",

            "loggedIn": true

          }

        ]

      }

    },

    "navigationLevels": {

      "levels": [

        {}

      ]

    },

    "navigationTitles": {

      "titles": [

        {}

      ]

    },

    "regexInternalExternal": {

      "rules": [

        {

          "regex": "^(?!https?://).*",

          "internal": false

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com/login.php.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com/dialog.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com/v1\\.0/.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com/oauth.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com/v2\\.0/.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com/checkpoint.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*facebook\\.com.*",

          "internal": true

        },

        {

          "regex": "https?://([-\\w]+\\.)*plus\\.google\\.com/share.*",

          "internal": false

        },

        {

          "regex": "https?://([-\\w]+\\.)*twitter\\.com/.*",

          "internal": false

        },

        {

          "regex": "https?://([-\\w]+\\.)*instagram\\.com/.*",

          "internal": false

        },

        {

          "regex": "https?://maps\\.google\\.com.*",

          "internal": false

        },

        {

          "regex": "https?://([-\\w]+\\.)*linkedin\\.com/.*",

          "internal": false

        },

        {

          "regex": "https?://([-\\w]+\\.)*google\\.com/maps/search/.*",

          "internal": false

        },

        {

          "regex": ".*",

          "internal": true

        }

      ]

    },

    "toolbarNavigation": null

  },

  "styling": {

    "icon": "images/logo1_white_padded.png",

    "iosHeaderImage": "images/logo1.png",

    "showActionBar": false,

    "showNavigationBar": false,

    "iosSidebarFont": "Default",

    "androidHideTitleInActionBar": false,

    "navigationTitleImage": false,

    "iosTheme": "default",

    "androidTheme": "light",

    "menuAnimationDuration": 0.15,

    "transitionInteractiveDelayMax": 0.2,

    "hideWebviewAlpha": 0.5,

    "disableAnimations": false,

    "androidShowSplash": true,

    "androidSidebarBackgroundColor": "#FFFFFF",

    "androidSidebarForegroundColor": "#777777",

    "androidActionBarBackgroundColor": "#bdbdbd",

    "androidActionBarForegroundColor": "#000000",

    "androidPullToRefreshColor": "#777777",

    "androidAccentColor": "#009688",

    "androidSidebarSeparatorColor": "#585858",

    "androidTabBarBackgroundColor": "#bdbdbd",

    "androidTabBarTextColor": "#000000",

    "androidTabBarIndicatorColor": "#000000",

    "androidLaunchImages": {},

    "iosLaunchScreen": {

      "backgroundColor": "#FFFFFF",

      "backgroundImage": "https://s3.amazonaws.com/gonativeio/public/ios_launch_screen_background_default_FFFFFF_1_2x2.png"

    },

    "androidStatusBarBackgroundColor": "#909090"

  },

  "forms": {

    "search": {},

    "loginConfig": {

      "formSelector": null,

      "loginIsFirstPage": false

    },

    "signupConfig": {

      "active": false,

      "formSelector": null

    }

  },

  "permissions": {

    "usesGeolocation": true,

    "androidDownloadToPublicStorage": true,

    "enableWebRTC": true

  },

  "performance": {

    "webviewPools": [

      {

        "urls": [

          {

            "disown": "reload"

          }

        ]

      }

    ]

  },

  "publishing": {},

  "services": {

    "push": {

      "active": false

    },

    "analytics": {

      "active": false

    },

    "parse": {

      "active": false,

      "pushEnabled": false

    },

    "facebook": {

      "active": false

    },

    "oneSignal": {

      "active": false,

      "notificationExtension": false

    },

    "registration": {

      "active": false,

      "endpoints": [

        {

          "url": null,

          "urlRegex": null,

          "dataType": [

            "parse",

            "oneSignal",

            "xtremepush"

          ]

        }

      ]

    }

  }

}
